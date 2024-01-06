package cn.sun.hw.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import cn.sun.hw.model.sub.ResultVo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

/**
 * http连接请求辅助
 */
public class HttpClientUtil2 {
	public HttpClientUtil2() {

	}

	public static String doPostWithParam(String url, String value) {
		// 创建一个post对象
		HttpPost post = new HttpPost(url);
		/*
		 * if (headerMap != null) { for (Map.Entry<String, String> entry :
		 * headerMap.entrySet()) { post.addHeader(entry.getKey(), entry.getValue()); } }
		 */
		// 包装成一个Entity对象

		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			StringEntity entity = new StringEntity(value, "UTF-8");
			entity.setContentType("application/json");// 发送json数据需要设置contentType
			// 设置请求的内容
			post.setEntity(entity);

			httpClient = HttpClients.createDefault();

			// 执行post请求
			response = httpClient.execute(post);
			return EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					System.out.println("response请求异常");
				}
			}
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					System.out.println("httpClient关闭异常");
				}
			}
		}
		return null;
	}

	public static String getRandomNum() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int digit = random.nextInt(10);
			sb.append(digit);
		}

		String randomNum = sb.toString();
		return randomNum;
	}

	public static String translateEnText(String textToTranslate)
			throws IOException, NoSuchAlgorithmException, InterruptedException {
		String id = "20240106001933027";
		String apiKey = "fuKhqU5nz9Bfy1cX37Fh"; // Replace with your API key
		String fromLanguage = "en"; // 英文
		String toLanguage = "zh"; // 中文
		String baseUrl = "https://fanyi-api.baidu.com/api/trans/vip/translate";
		String salt = getRandomNum();
		String sign = id + textToTranslate + salt + apiKey;
		Thread.sleep(1200);// QPS限制
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] messageDigest = md.digest(sign.getBytes());

		StringBuilder hexBuilder = new StringBuilder();
		for (byte b : messageDigest) {
			hexBuilder.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
		}
		String requestData = "?q=" + URLEncoder.encode(textToTranslate, "UTF-8") + "&from=" + fromLanguage + "&to="
				+ toLanguage + "&appid=" + id + "&salt=" + salt + "&sign=" + hexBuilder.toString().toLowerCase();
		URL url = new URL(baseUrl + requestData);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
//		  connection.setRequestProperty("Content-Type", "application/json");
//		  connection.setRequestProperty("User-Agent", "Mozilla/5.0");
		connection.setDoOutput(true);
		connection.connect();
		String response = "";
		try (Scanner scanner = new Scanner(connection.getInputStream())) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				response += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
		ResultVo result = JacksonUtil.toJavaObject(response, ResultVo.class);
		System.out.println(JacksonUtil.toJSONString(result));
		char[] charList = result.getTrans_result().get(0).getDst().toCharArray();
		String str = new String(charList);
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) throws Exception {
		    	String textToTranslate = "This is an example paragraph to translate from English to Chinese.";  
		    	String response = translateEnText(textToTranslate);
		        System.out.println(response); // Print the translated text to the console  

	}

}
