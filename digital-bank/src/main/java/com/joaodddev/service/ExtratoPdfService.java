package com.joaodddev.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.List;

public class ExtratoPdfService {

    public static void gerarExtrato(String nomeCliente,
                                     int numeroConta,
                                     double saldo,
                                     List<String> historico) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("extrato_conta_" + numeroConta + ".pdf"));

            document.open();

            document.add(new Paragraph("BANCO DIGITAL JV"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cliente: " + nomeCliente));
            document.add(new Paragraph("Conta: " + numeroConta));
            document.add(new Paragraph("Data: " + LocalDate.now()));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Saldo Atual: R$ " + saldo));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("===== HISTÓRICO ====="));
            document.add(new Paragraph(" "));

            for (String mov : historico) {
                document.add(new Paragraph(mov));
            }

            document.close();

            System.out.println("PDF gerado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
