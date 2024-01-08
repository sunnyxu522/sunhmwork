package cn.sun.hw.util;

import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import cn.sun.hw.model.sub.TextVo;
import cn.sun.hw.model.sub.UploadResult;

public class PdfCommon {

	public static UploadResult generatePDF(List<TextVo> list, String fileName, String titleName,String titleNameCn,long clapCount) {
		Document document = null;
		try {
			document = PdfUtil.createDocument();

			UploadResult fileUploadResult = new UploadResult();
			String nameSub = titleName;
			if(titleName.length()>8) {
				nameSub=titleName.substring(0, 8);
			}
			fileUploadResult.setPath("C:\\" + fileName+"|" +nameSub+".pdf");
			fileUploadResult.setName(fileName);
			FileOutputStream fos = new FileOutputStream(fileUploadResult.getPath());
			PdfWriter.getInstance(document, fos);
			document.open();

			// 字体定义
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			Font titlefont = new Font(bfChinese, 16, Font.BOLD);
			Font textfont = new Font(bfChinese, 10, Font.NORMAL);

			// 生成居中标题
			Paragraph title = PdfUtil.createParagraph(titleName, titlefont);
			title.setAlignment(Element.ALIGN_LEFT);
			document.add(title);
			document.add(new Paragraph("   "));
			//中文标题
			Paragraph titleCN = PdfUtil.createParagraph(titleNameCn, titlefont);
			title.setAlignment(Element.ALIGN_LEFT);
			document.add(titleCN);
			document.add(new Paragraph("   "));
			
			String concent = "点赞数："+clapCount;
			Paragraph paragraph2 = new Paragraph(concent, textfont);
			paragraph2.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph2);
			
			for (TextVo textVo : list) {
				String concent1 = textVo.getText();
				Paragraph paragraph3 = new Paragraph(concent1, textfont);
				paragraph2.setAlignment(Element.ALIGN_CENTER);
				document.add(paragraph3);
			}

			return fileUploadResult;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (document != null)
				document.close();
		}
		return null;
	}
}
