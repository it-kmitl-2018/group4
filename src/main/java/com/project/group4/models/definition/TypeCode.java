package com.project.group4.models.definition;

public enum TypeCode {

    DEBIT_NOTE("80", "ใบเพิ่มหนี้ (Debit note)"),
    CREDIT_NOTE("81", "ใบลดหนี้ (Credit note)"),
    INVOICE("380", "ใบแจ้งหนี้ (Invoice)"),
    TAX_INVOICE("388", "ใบกำกับภาษี (Tax Invoice)"),
    RECEIPT("T01", "ใบรับ (Receipt)"),
    INVOICE_AND_TAX_INVOICE("T02", "ใบแจ้งหนี้/ใบกากับภาษี (Invoice/ Tax Invoice)"),
    RECEIPT_AND_TAX_INVOICE("T03", "ใบเสร็จรับเงิน/ใบกากับภาษี (Receipt/ Tax Invoice)"),
    DELIVERY_ORDER_AND_TAX_INVOICE("T04", "ใบส่งของ/ใบกากับภาษี (Delivery order/ Tax Invoice)"),
    ABBREVIATED_TAX_INVOICE("T05", "ใบกากับภาษีอย่างย่อ (Abbreviated Tax Invoice )"),
    RECEIPT_AND_ABBREVIATED_TAX_INVOICE("T06", "ใบเสร็จรับเงิน/ใบกากับภาษีอย่างย่อ (Receipt/Abbreviated Tax Invoice)"),
    CANCELLATION_NOTE("T07", "ใบแจ้งยกเลิก (Cancellation note)");

    private String typeCode;
    private String detail;

    TypeCode(String typeCode, String detail) {
        this.typeCode = typeCode;
        this.detail = detail;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getDetail() {
        return detail;
    }
}
