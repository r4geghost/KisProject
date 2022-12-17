package com.example.kis_db_proj.mapper;

import java.util.List;

import com.example.kis_db_proj.model.TmVag;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TmVagMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from tm_vag",
        "where nomvag = #{nomvag,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String nomvag);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into tm_vag (nomvag, vrsvop, ",
        "id_poezd, dis_esr, dis_park, ",
        "dis_put, kodop, tip_op, ",
        "savedate, kod_kateg, ",
        "esr_nazn, ves_gruz, ",
        "pnv)",
        "values (#{nomvag,jdbcType=CHAR}, #{vrsvop,jdbcType=TIMESTAMP}, ",
        "#{idPoezd,jdbcType=NUMERIC}, #{disEsr,jdbcType=CHAR}, #{disPark,jdbcType=CHAR}, ",
        "#{disPut,jdbcType=CHAR}, #{kodop,jdbcType=CHAR}, #{tipOp,jdbcType=CHAR}, ",
        "#{savedate,jdbcType=TIMESTAMP}, #{kodKateg,jdbcType=SMALLINT}, ",
        "#{esrNazn,jdbcType=VARCHAR}, #{vesGruz,jdbcType=NUMERIC}, ",
        "#{pnv,jdbcType=NUMERIC})"
    })
    int insert(TmVag row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "nomvag, vrsvop, id_poezd, dis_esr, dis_park, dis_put, kodop, tip_op, savedate, ",
        "kod_kateg, esr_nazn, ves_gruz, pnv",
        "from tm_vag",
        "where nomvag = #{nomvag,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="nomvag", property="nomvag", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="vrsvop", property="vrsvop", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_poezd", property="idPoezd", jdbcType=JdbcType.NUMERIC),
        @Result(column="dis_esr", property="disEsr", jdbcType=JdbcType.CHAR),
        @Result(column="dis_park", property="disPark", jdbcType=JdbcType.CHAR),
        @Result(column="dis_put", property="disPut", jdbcType=JdbcType.CHAR),
        @Result(column="kodop", property="kodop", jdbcType=JdbcType.CHAR),
        @Result(column="tip_op", property="tipOp", jdbcType=JdbcType.CHAR),
        @Result(column="savedate", property="savedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="kod_kateg", property="kodKateg", jdbcType=JdbcType.SMALLINT),
        @Result(column="esr_nazn", property="esrNazn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ves_gruz", property="vesGruz", jdbcType=JdbcType.NUMERIC),
        @Result(column="pnv", property="pnv", jdbcType=JdbcType.NUMERIC)
    })
    TmVag selectByPrimaryKey(String nomvag);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "nomvag, vrsvop, id_poezd, dis_esr, dis_park, dis_put, kodop, tip_op, savedate, ",
        "kod_kateg, esr_nazn, ves_gruz, pnv",
        "from tm_vag"
    })
    @Results({
        @Result(column="nomvag", property="nomvag", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="vrsvop", property="vrsvop", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_poezd", property="idPoezd", jdbcType=JdbcType.NUMERIC),
        @Result(column="dis_esr", property="disEsr", jdbcType=JdbcType.CHAR),
        @Result(column="dis_park", property="disPark", jdbcType=JdbcType.CHAR),
        @Result(column="dis_put", property="disPut", jdbcType=JdbcType.CHAR),
        @Result(column="kodop", property="kodop", jdbcType=JdbcType.CHAR),
        @Result(column="tip_op", property="tipOp", jdbcType=JdbcType.CHAR),
        @Result(column="savedate", property="savedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="kod_kateg", property="kodKateg", jdbcType=JdbcType.SMALLINT),
        @Result(column="esr_nazn", property="esrNazn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ves_gruz", property="vesGruz", jdbcType=JdbcType.NUMERIC),
        @Result(column="pnv", property="pnv", jdbcType=JdbcType.NUMERIC)
    })
    List<TmVag> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update tm_vag",
        "set vrsvop = #{vrsvop,jdbcType=TIMESTAMP},",
          "id_poezd = #{idPoezd,jdbcType=NUMERIC},",
          "dis_esr = #{disEsr,jdbcType=CHAR},",
          "dis_park = #{disPark,jdbcType=CHAR},",
          "dis_put = #{disPut,jdbcType=CHAR},",
          "kodop = #{kodop,jdbcType=CHAR},",
          "tip_op = #{tipOp,jdbcType=CHAR},",
          "savedate = #{savedate,jdbcType=TIMESTAMP},",
          "kod_kateg = #{kodKateg,jdbcType=SMALLINT},",
          "esr_nazn = #{esrNazn,jdbcType=VARCHAR},",
          "ves_gruz = #{vesGruz,jdbcType=NUMERIC},",
          "pnv = #{pnv,jdbcType=NUMERIC}",
        "where nomvag = #{nomvag,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TmVag row);
}