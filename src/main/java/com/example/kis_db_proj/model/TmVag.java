package com.example.kis_db_proj.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: tm_vag
 */
public class TmVag {
    /**
     * Column: nomvag
     * Type: bpchar(8)
     * Remark: Номер вагона
     */
    private String nomvag;

    /**
     * Column: vrsvop
     * Type: timestamp
     * Remark: Время свершения операции
     */
    private Date vrsvop;

    /**
     * Column: id_poezd
     * Type: numeric
     * Default value: 0
     * Remark: Идентификатор поезда
     */
    private BigDecimal idPoezd;

    /**
     * Column: dis_esr
     * Type: bpchar(6)
     */
    private String disEsr;

    /**
     * Column: dis_park
     * Type: bpchar(2)
     */
    private String disPark;

    /**
     * Column: dis_put
     * Type: bpchar(2)
     */
    private String disPut;

    /**
     * Column: kodop
     * Type: bpchar(2)
     * Remark: Код операции с вагоном
     */
    private String kodop;

    /**
     * Column: tip_op
     * Type: bpchar(2)
     * Remark: Тип операции с вагоном
     */
    private String tipOp;

    /**
     * Column: savedate
     * Type: timestamp
     * Default value: LOCALTIMESTAMP
     * Remark: Время записи в бд
     */
    private Date savedate;

    /**
     * Column: kod_kateg
     * Type: int2
     * Remark: Код категории парка
     */
    private Short kodKateg;

    /**
     * Column: esr_nazn
     * Type: varchar(6)
     * Remark: Код еср станции назначения вагона
     */
    private String esrNazn;

    /**
     * Column: ves_gruz
     * Type: numeric
     * Remark: Вес груза в тоннах
     */
    private BigDecimal vesGruz;

    /**
     * Column: pnv
     * Type: numeric
     * Remark: Порядковый номер вагона в поезде
     */
    private BigDecimal pnv;

    public String getNomvag() {
        return nomvag;
    }

    public void setNomvag(String nomvag) {
        this.nomvag = nomvag == null ? null : nomvag.trim();
    }

    public Date getVrsvop() {
        return vrsvop;
    }

    public void setVrsvop(Date vrsvop) {
        this.vrsvop = vrsvop;
    }

    public BigDecimal getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(BigDecimal idPoezd) {
        this.idPoezd = idPoezd;
    }

    public String getDisEsr() {
        return disEsr;
    }

    public void setDisEsr(String disEsr) {
        this.disEsr = disEsr == null ? null : disEsr.trim();
    }

    public String getDisPark() {
        return disPark;
    }

    public void setDisPark(String disPark) {
        this.disPark = disPark == null ? null : disPark.trim();
    }

    public String getDisPut() {
        return disPut;
    }

    public void setDisPut(String disPut) {
        this.disPut = disPut == null ? null : disPut.trim();
    }

    public String getKodop() {
        return kodop;
    }

    public void setKodop(String kodop) {
        this.kodop = kodop == null ? null : kodop.trim();
    }

    public String getTipOp() {
        return tipOp;
    }

    public void setTipOp(String tipOp) {
        this.tipOp = tipOp == null ? null : tipOp.trim();
    }

    public Date getSavedate() {
        return savedate;
    }

    public void setSavedate(Date savedate) {
        this.savedate = savedate;
    }

    public Short getKodKateg() {
        return kodKateg;
    }

    public void setKodKateg(Short kodKateg) {
        this.kodKateg = kodKateg;
    }

    public String getEsrNazn() {
        return esrNazn;
    }

    public void setEsrNazn(String esrNazn) {
        this.esrNazn = esrNazn == null ? null : esrNazn.trim();
    }

    public BigDecimal getVesGruz() {
        return vesGruz;
    }

    public void setVesGruz(BigDecimal vesGruz) {
        this.vesGruz = vesGruz;
    }

    public BigDecimal getPnv() {
        return pnv;
    }

    public void setPnv(BigDecimal pnv) {
        this.pnv = pnv;
    }
}