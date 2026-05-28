/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class BatteryVersion2LifeDataInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer timeRequest;
    Integer index;
    Integer appVersion;
    Integer timeSum1;
    Integer tl_vl;
    Integer tl_vm;
    Integer tl_vmh;
    Integer tl_vh;
    Integer tlm_vl;
    Integer tlm_vm;
    Integer tlm_vmh;
    Integer tlm_vh;
    Integer tm_vl;
    Integer tm_vm;
    Integer tm_vmh;
    Integer tm_vh;
    Integer th_vl;
    Integer th_vm;
    Integer th_vmh;
    Integer th_vh;
    Integer th_dsg;
    Integer t_idle_max;
    Integer crc16;
    Integer timeSum2;
    Integer vl1;
    Integer vl2;
    Integer vl3;
    Integer vl4;
    Integer vh1;
    Integer vh2;
    Integer vh3;
    Integer chgT1;
    Integer chgT2;
    Integer chgT3;
    Integer chgT4;
    Integer dsgTh;
    Integer chgTmax;
    Integer dsgTmax;
    Integer mosTmax;
    Integer connPositiveTmax;
    Integer connNegativeTmax;
    Integer vMin;
    Integer vMax;
    Integer tMax;
    Integer tMin;
    Integer cellNuml;
    Integer cellNumh;
    Integer crc8;
    Integer pf_state;
    Integer hw_temp1_bat_cnt;
    Integer hw_temp2_bat_cnt;
    Integer hw_temp_mos_cnt;
    Integer hw_temp_con_cnt;
    Integer hw_temp_conneg_cnt;
    Integer hw_ov_bat_cnt;
    Integer hw_ov_pack_cnt;
    Integer hw_uv_bat_cnt;
    Integer hw_uv_pack_cnt;
    Integer hw_ov_cell_cnt;
    Integer hw_uv_cell_cnt;
    Integer hw_sply_vol_l_cnt;
    Integer hw_sply_vol_h_cnt;
    Integer p_occ_cnt;
    Integer p_ocd_cnt;
    Integer p_old_cnt;
    Integer p_sys_err_cnt;
    Integer p_scd_cnt;
    Integer p_otc_bat_cnt;
    Integer p_otd_bat_cnt;
    Integer p_otd_start_bat_cnt;
    Integer p_otd_mos_cnt;
    Integer p_otc_mos_cnt;
    Integer p_encr_comm_cnt;
    Integer p_flash_comm_cnt;
    Integer alert_ot_bat_cnt;
    Integer alert_ot_mos_cnt;
    Integer alert_vpack_samp_err_cnt;
    Integer alert_v_insecure_cnt;
    Integer alert_v_phasev_cell_cnt;
    Integer alert_ov_cell_cnt;
    Integer p_afe_comm_cnt;
    Integer alert_v_imbalance_cnt;
    Integer alert_v_imbalance_remind_cnt;
    Integer alert_v_dsgdiff_cnt;
    Integer algo_soc_no_change_cnt;
    Integer algo_soc_jump_othr_cnt;
    Integer algo_soc_jump_err_cnt;
    Integer algo_soc_dji_jump_cnt;
    Integer algo_qmax_othr_cnt;
    Integer algo_qmax_uthr_cnt;
    Integer algo_qbat_othr_cnt;
    Integer algo_qbat_uthr_cnt;
    Integer algo_qmax_longtime_unupdate_cnt;
    Integer algo_qmax_longcycle_unupdate_cnt;
    Integer algo_ra_othr_cnt;
    Integer algo_ra_uthr_cnt;
    Integer algo_fulldsg_eoc_high_cnt;
    Integer algo_fullchg_eoc_high_cnt;
    Integer algo_power_othr_cnt;
    Integer algo_balance_err_cnt;
    Integer diag_crc16;
    Integer cycle_cnt;
    Integer sohc;
    Integer sohr;

    public BatteryVersion2LifeDataInfo() {
    }

    public BatteryVersion2LifeDataInfo(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11, Integer n12, Integer n13, Integer n14, Integer n15, Integer n16, Integer n17, Integer n18, Integer n19, Integer n20, Integer n21, Integer n22, Integer n23, Integer n24, Integer n25, Integer n26, Integer n27, Integer n28, Integer n29, Integer n30, Integer n31, Integer n32, Integer n33, Integer n34, Integer n35, Integer n36, Integer n37, Integer n38, Integer n39, Integer n40, Integer n41, Integer n42, Integer n43, Integer n44, Integer n45, Integer n46, Integer n47, Integer n48, Integer n49, Integer n50, Integer n51, Integer n52, Integer n53, Integer n54, Integer n55, Integer n56, Integer n57, Integer n58, Integer n59, Integer n60, Integer n61, Integer n62, Integer n63, Integer n64, Integer n65, Integer n66, Integer n67, Integer n68, Integer n69, Integer n70, Integer n71, Integer n72, Integer n73, Integer n74, Integer n75, Integer n76, Integer n77, Integer n78, Integer n79, Integer n80, Integer n81, Integer n82, Integer n83, Integer n84, Integer n85, Integer n86, Integer n87, Integer n88, Integer n89, Integer n90, Integer n91, Integer n92, Integer n93, Integer n94, Integer n95, Integer n96, Integer n97, Integer n98, Integer n99, Integer n100, Integer n101, Integer n102, Integer n103, Integer n104, Integer n105) {
    }

    public static BatteryVersion2LifeDataInfo fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getTimeRequest() {
        return null;
    }

    public void setTimeRequest(Integer n) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getAppVersion() {
        return null;
    }

    public void setAppVersion(Integer n) {
    }

    public Integer getTimeSum1() {
        return null;
    }

    public void setTimeSum1(Integer n) {
    }

    public Integer getTl_vl() {
        return null;
    }

    public void setTl_vl(Integer n) {
    }

    public Integer getTl_vm() {
        return null;
    }

    public void setTl_vm(Integer n) {
    }

    public Integer getTl_vmh() {
        return null;
    }

    public void setTl_vmh(Integer n) {
    }

    public Integer getTl_vh() {
        return null;
    }

    public void setTl_vh(Integer n) {
    }

    public Integer getTlm_vl() {
        return null;
    }

    public void setTlm_vl(Integer n) {
    }

    public Integer getTlm_vm() {
        return null;
    }

    public void setTlm_vm(Integer n) {
    }

    public Integer getTlm_vmh() {
        return null;
    }

    public void setTlm_vmh(Integer n) {
    }

    public Integer getTlm_vh() {
        return null;
    }

    public void setTlm_vh(Integer n) {
    }

    public Integer getTm_vl() {
        return null;
    }

    public void setTm_vl(Integer n) {
    }

    public Integer getTm_vm() {
        return null;
    }

    public void setTm_vm(Integer n) {
    }

    public Integer getTm_vmh() {
        return null;
    }

    public void setTm_vmh(Integer n) {
    }

    public Integer getTm_vh() {
        return null;
    }

    public void setTm_vh(Integer n) {
    }

    public Integer getTh_vl() {
        return null;
    }

    public void setTh_vl(Integer n) {
    }

    public Integer getTh_vm() {
        return null;
    }

    public void setTh_vm(Integer n) {
    }

    public Integer getTh_vmh() {
        return null;
    }

    public void setTh_vmh(Integer n) {
    }

    public Integer getTh_vh() {
        return null;
    }

    public void setTh_vh(Integer n) {
    }

    public Integer getTh_dsg() {
        return null;
    }

    public void setTh_dsg(Integer n) {
    }

    public Integer getT_idle_max() {
        return null;
    }

    public void setT_idle_max(Integer n) {
    }

    public Integer getCrc16() {
        return null;
    }

    public void setCrc16(Integer n) {
    }

    public Integer getTimeSum2() {
        return null;
    }

    public void setTimeSum2(Integer n) {
    }

    public Integer getVl1() {
        return null;
    }

    public void setVl1(Integer n) {
    }

    public Integer getVl2() {
        return null;
    }

    public void setVl2(Integer n) {
    }

    public Integer getVl3() {
        return null;
    }

    public void setVl3(Integer n) {
    }

    public Integer getVl4() {
        return null;
    }

    public void setVl4(Integer n) {
    }

    public Integer getVh1() {
        return null;
    }

    public void setVh1(Integer n) {
    }

    public Integer getVh2() {
        return null;
    }

    public void setVh2(Integer n) {
    }

    public Integer getVh3() {
        return null;
    }

    public void setVh3(Integer n) {
    }

    public Integer getChgT1() {
        return null;
    }

    public void setChgT1(Integer n) {
    }

    public Integer getChgT2() {
        return null;
    }

    public void setChgT2(Integer n) {
    }

    public Integer getChgT3() {
        return null;
    }

    public void setChgT3(Integer n) {
    }

    public Integer getChgT4() {
        return null;
    }

    public void setChgT4(Integer n) {
    }

    public Integer getDsgTh() {
        return null;
    }

    public void setDsgTh(Integer n) {
    }

    public Integer getChgTmax() {
        return null;
    }

    public void setChgTmax(Integer n) {
    }

    public Integer getDsgTmax() {
        return null;
    }

    public void setDsgTmax(Integer n) {
    }

    public Integer getMosTmax() {
        return null;
    }

    public void setMosTmax(Integer n) {
    }

    public Integer getConnPositiveTmax() {
        return null;
    }

    public void setConnPositiveTmax(Integer n) {
    }

    public Integer getConnNegativeTmax() {
        return null;
    }

    public void setConnNegativeTmax(Integer n) {
    }

    public Integer getVMin() {
        return null;
    }

    public void setVMin(Integer n) {
    }

    public Integer getVMax() {
        return null;
    }

    public void setVMax(Integer n) {
    }

    public Integer getTMax() {
        return null;
    }

    public void setTMax(Integer n) {
    }

    public Integer getTMin() {
        return null;
    }

    public void setTMin(Integer n) {
    }

    public Integer getCellNuml() {
        return null;
    }

    public void setCellNuml(Integer n) {
    }

    public Integer getCellNumh() {
        return null;
    }

    public void setCellNumh(Integer n) {
    }

    public Integer getCrc8() {
        return null;
    }

    public void setCrc8(Integer n) {
    }

    public Integer getPf_state() {
        return null;
    }

    public void setPf_state(Integer n) {
    }

    public Integer getHw_temp1_bat_cnt() {
        return null;
    }

    public void setHw_temp1_bat_cnt(Integer n) {
    }

    public Integer getHw_temp2_bat_cnt() {
        return null;
    }

    public void setHw_temp2_bat_cnt(Integer n) {
    }

    public Integer getHw_temp_mos_cnt() {
        return null;
    }

    public void setHw_temp_mos_cnt(Integer n) {
    }

    public Integer getHw_temp_con_cnt() {
        return null;
    }

    public void setHw_temp_con_cnt(Integer n) {
    }

    public Integer getHw_temp_conneg_cnt() {
        return null;
    }

    public void setHw_temp_conneg_cnt(Integer n) {
    }

    public Integer getHw_ov_bat_cnt() {
        return null;
    }

    public void setHw_ov_bat_cnt(Integer n) {
    }

    public Integer getHw_ov_pack_cnt() {
        return null;
    }

    public void setHw_ov_pack_cnt(Integer n) {
    }

    public Integer getHw_uv_bat_cnt() {
        return null;
    }

    public void setHw_uv_bat_cnt(Integer n) {
    }

    public Integer getHw_uv_pack_cnt() {
        return null;
    }

    public void setHw_uv_pack_cnt(Integer n) {
    }

    public Integer getHw_ov_cell_cnt() {
        return null;
    }

    public void setHw_ov_cell_cnt(Integer n) {
    }

    public Integer getHw_uv_cell_cnt() {
        return null;
    }

    public void setHw_uv_cell_cnt(Integer n) {
    }

    public Integer getHw_sply_vol_l_cnt() {
        return null;
    }

    public void setHw_sply_vol_l_cnt(Integer n) {
    }

    public Integer getHw_sply_vol_h_cnt() {
        return null;
    }

    public void setHw_sply_vol_h_cnt(Integer n) {
    }

    public Integer getP_occ_cnt() {
        return null;
    }

    public void setP_occ_cnt(Integer n) {
    }

    public Integer getP_ocd_cnt() {
        return null;
    }

    public void setP_ocd_cnt(Integer n) {
    }

    public Integer getP_old_cnt() {
        return null;
    }

    public void setP_old_cnt(Integer n) {
    }

    public Integer getP_sys_err_cnt() {
        return null;
    }

    public void setP_sys_err_cnt(Integer n) {
    }

    public Integer getP_scd_cnt() {
        return null;
    }

    public void setP_scd_cnt(Integer n) {
    }

    public Integer getP_otc_bat_cnt() {
        return null;
    }

    public void setP_otc_bat_cnt(Integer n) {
    }

    public Integer getP_otd_bat_cnt() {
        return null;
    }

    public void setP_otd_bat_cnt(Integer n) {
    }

    public Integer getP_otd_start_bat_cnt() {
        return null;
    }

    public void setP_otd_start_bat_cnt(Integer n) {
    }

    public Integer getP_otd_mos_cnt() {
        return null;
    }

    public void setP_otd_mos_cnt(Integer n) {
    }

    public Integer getP_otc_mos_cnt() {
        return null;
    }

    public void setP_otc_mos_cnt(Integer n) {
    }

    public Integer getP_encr_comm_cnt() {
        return null;
    }

    public void setP_encr_comm_cnt(Integer n) {
    }

    public Integer getP_flash_comm_cnt() {
        return null;
    }

    public void setP_flash_comm_cnt(Integer n) {
    }

    public Integer getAlert_ot_bat_cnt() {
        return null;
    }

    public void setAlert_ot_bat_cnt(Integer n) {
    }

    public Integer getAlert_ot_mos_cnt() {
        return null;
    }

    public void setAlert_ot_mos_cnt(Integer n) {
    }

    public Integer getAlert_vpack_samp_err_cnt() {
        return null;
    }

    public void setAlert_vpack_samp_err_cnt(Integer n) {
    }

    public Integer getAlert_v_insecure_cnt() {
        return null;
    }

    public void setAlert_v_insecure_cnt(Integer n) {
    }

    public Integer getAlert_v_phasev_cell_cnt() {
        return null;
    }

    public void setAlert_v_phasev_cell_cnt(Integer n) {
    }

    public Integer getAlert_ov_cell_cnt() {
        return null;
    }

    public void setAlert_ov_cell_cnt(Integer n) {
    }

    public Integer getP_afe_comm_cnt() {
        return null;
    }

    public void setP_afe_comm_cnt(Integer n) {
    }

    public Integer getAlert_v_imbalance_cnt() {
        return null;
    }

    public void setAlert_v_imbalance_cnt(Integer n) {
    }

    public Integer getAlert_v_imbalance_remind_cnt() {
        return null;
    }

    public void setAlert_v_imbalance_remind_cnt(Integer n) {
    }

    public Integer getAlert_v_dsgdiff_cnt() {
        return null;
    }

    public void setAlert_v_dsgdiff_cnt(Integer n) {
    }

    public Integer getAlgo_soc_no_change_cnt() {
        return null;
    }

    public void setAlgo_soc_no_change_cnt(Integer n) {
    }

    public Integer getAlgo_soc_jump_othr_cnt() {
        return null;
    }

    public void setAlgo_soc_jump_othr_cnt(Integer n) {
    }

    public Integer getAlgo_soc_jump_err_cnt() {
        return null;
    }

    public void setAlgo_soc_jump_err_cnt(Integer n) {
    }

    public Integer getAlgo_soc_dji_jump_cnt() {
        return null;
    }

    public void setAlgo_soc_dji_jump_cnt(Integer n) {
    }

    public Integer getAlgo_qmax_othr_cnt() {
        return null;
    }

    public void setAlgo_qmax_othr_cnt(Integer n) {
    }

    public Integer getAlgo_qmax_uthr_cnt() {
        return null;
    }

    public void setAlgo_qmax_uthr_cnt(Integer n) {
    }

    public Integer getAlgo_qbat_othr_cnt() {
        return null;
    }

    public void setAlgo_qbat_othr_cnt(Integer n) {
    }

    public Integer getAlgo_qbat_uthr_cnt() {
        return null;
    }

    public void setAlgo_qbat_uthr_cnt(Integer n) {
    }

    public Integer getAlgo_qmax_longtime_unupdate_cnt() {
        return null;
    }

    public void setAlgo_qmax_longtime_unupdate_cnt(Integer n) {
    }

    public Integer getAlgo_qmax_longcycle_unupdate_cnt() {
        return null;
    }

    public void setAlgo_qmax_longcycle_unupdate_cnt(Integer n) {
    }

    public Integer getAlgo_ra_othr_cnt() {
        return null;
    }

    public void setAlgo_ra_othr_cnt(Integer n) {
    }

    public Integer getAlgo_ra_uthr_cnt() {
        return null;
    }

    public void setAlgo_ra_uthr_cnt(Integer n) {
    }

    public Integer getAlgo_fulldsg_eoc_high_cnt() {
        return null;
    }

    public void setAlgo_fulldsg_eoc_high_cnt(Integer n) {
    }

    public Integer getAlgo_fullchg_eoc_high_cnt() {
        return null;
    }

    public void setAlgo_fullchg_eoc_high_cnt(Integer n) {
    }

    public Integer getAlgo_power_othr_cnt() {
        return null;
    }

    public void setAlgo_power_othr_cnt(Integer n) {
    }

    public Integer getAlgo_balance_err_cnt() {
        return null;
    }

    public void setAlgo_balance_err_cnt(Integer n) {
    }

    public Integer getDiag_crc16() {
        return null;
    }

    public void setDiag_crc16(Integer n) {
    }

    public Integer getCycle_cnt() {
        return null;
    }

    public void setCycle_cnt(Integer n) {
    }

    public Integer getSohc() {
        return null;
    }

    public void setSohc(Integer n) {
    }

    public Integer getSohr() {
        return null;
    }

    public void setSohr(Integer n) {
    }

    public String toString() {
        return null;
    }
}

