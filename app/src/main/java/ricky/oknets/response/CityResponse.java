package ricky.oknets.response;

import java.io.Serializable;
import java.util.List;

/**
 * @author YaoWeihui on 2016/5/10.
 */
public class CityResponse implements Serializable {

    /**
     * code : 0
     * msg : success
     * data : {"timestamp":1462273822,"hotCity":[{"name":"保山市","si":"B","abbr":"BS","fp":"BAOSHAN","provinceCode":1,"cityCode":104,"arealist":[{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]},{"name":"昆明市","si":"K","abbr":"KM","fp":"KUNMING","provinceCode":1,"cityCode":101,"arealist":[{"areacode":"010101","areaname":"五华区"},{"areacode":"010102","areaname":"盘龙区"},{"areacode":"010103","areaname":"官渡区"},{"areacode":"010104","areaname":"西山区"},{"areacode":"010105","areaname":"东川区"},{"areacode":"010106","areaname":"呈贡区"},{"areacode":"010107","areaname":"安宁市"},{"areacode":"010108","areaname":"晋宁县"},{"areacode":"010109","areaname":"富民县"},{"areacode":"010110","areaname":"宜良县"},{"areacode":"010111","areaname":"嵩明县"},{"areacode":"010112","areaname":"石林彝族自治县"},{"areacode":"010113","areaname":"禄劝彝族苗族自治县"},{"areacode":"010114","areaname":"寻甸回族自治县"}]},{"name":"丽江市","si":"L","abbr":"LJ","fp":"LIJIANG","provinceCode":1,"cityCode":106,"arealist":[{"areacode":"010601","areaname":"古城区"},{"areacode":"010602","areaname":"永胜县"},{"areacode":"010603","areaname":"华坪县"},{"areacode":"010604","areaname":"玉龙纳西族自治县"},{"areacode":"010605","areaname":"宁蒗彝族自治县"}]},{"name":"普洱市","si":"P","abbr":"PE","fp":"PUER","provinceCode":1,"cityCode":107,"arealist":[{"areacode":"010701","areaname":"思茅区"},{"areacode":"010702","areaname":"宁洱哈尼族彝族自治县"},{"areacode":"010703","areaname":"墨江哈尼族自治县"},{"areacode":"010704","areaname":"景东彝族自治县"},{"areacode":"010705","areaname":"景谷彝族傣族自治县"},{"areacode":"010706","areaname":"镇沅彝族哈尼族拉祜族自治县"},{"areacode":"010707","areaname":"江城哈尼族彝族自治县"},{"areacode":"010708","areaname":"孟连傣族拉祜族佤族自治县"},{"areacode":"010709","areaname":"澜沧拉祜族自治县"},{"areacode":"010710","areaname":"西盟佤族自治县"}]},{"name":"曲靖市","si":"Q","abbr":"QJ","fp":"QUJING","provinceCode":1,"cityCode":102,"arealist":[{"areacode":"010201","areaname":"麒麟区"},{"areacode":"010202","areaname":"宣威市"},{"areacode":"010203","areaname":"马龙县"},{"areacode":"010204","areaname":"陆良县"},{"areacode":"010205","areaname":"师宗县"},{"areacode":"010206","areaname":"罗平县"},{"areacode":"010207","areaname":"富源县"},{"areacode":"010208","areaname":"会泽县"},{"areacode":"010209","areaname":"沾益县"}]},{"name":"深圳市","si":"S","abbr":"SZ","fp":"SHENZHEN","provinceCode":15,"cityCode":1501,"arealist":[{"areacode":"150101","areaname":"福田区"},{"areacode":"150102","areaname":"南山区"},{"areacode":"150103","areaname":"罗湖区"},{"areacode":"150104","areaname":"盐田区"},{"areacode":"150105","areaname":"宝安区"},{"areacode":"150106","areaname":"龙岗区"}]},{"name":"玉溪市","si":"Y","abbr":"YX","fp":"YUXI","provinceCode":1,"cityCode":103,"arealist":[{"areacode":"010301","areaname":"红塔区"},{"areacode":"010302","areaname":"江川区"},{"areacode":"010303","areaname":"澄江县"},{"areacode":"010304","areaname":"通海县"},{"areacode":"010305","areaname":"华宁县"},{"areacode":"010306","areaname":"易门县"},{"areacode":"010307","areaname":"峨山彝族自治县"},{"areacode":"010308","areaname":"新平彝族傣族自治县"},{"areacode":"010309","areaname":"元江哈尼族彝族傣族自治县"}]},{"name":"昭通市","si":"Z","abbr":"ZT","fp":"ZHAOTONG","provinceCode":1,"cityCode":105,"arealist":[{"areacode":"010501","areaname":"昭阳区"},{"areacode":"010502","areaname":"鲁甸县"},{"areacode":"010503","areaname":"巧家县"},{"areacode":"010504","areaname":"盐津县"},{"areacode":"010505","areaname":"大关县"},{"areacode":"010506","areaname":"永善县"},{"areacode":"010507","areaname":"绥江县"},{"areacode":"010508","areaname":"镇雄县"},{"areacode":"010509","areaname":"彝良县"},{"areacode":"010510","areaname":"威信县"},{"areacode":"010511","areaname":"水富县"}]}],"list":[{"name":"保山市","si":"B","abbr":"BS","fp":"BAOSHAN","provinceCode":1,"cityCode":104,"arealist":[{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]},{"name":"楚雄彝族自治州","si":"C","abbr":"CXYZ","fp":"CHUXIONGYIZU","provinceCode":1,"cityCode":109,"arealist":[{"areacode":"010901","areaname":"楚雄市"},{"areacode":"010902","areaname":"双柏县"},{"areacode":"010903","areaname":"牟定县"},{"areacode":"010904","areaname":"南华县"},{"areacode":"010905","areaname":"姚安县"},{"areacode":"010906","areaname":"大姚县"},{"areacode":"010907","areaname":"永仁县"},{"areacode":"010908","areaname":"元谋县"},{"areacode":"010909","areaname":"武定县"},{"areacode":"010910","areaname":"禄丰县"}]},{"name":"大理白族自治州","si":"D","abbr":"DLBZU","fp":"DALI","provinceCode":1,"cityCode":113,"arealist":[{"areacode":"011301","areaname":"大理市"},{"areacode":"011302","areaname":"祥云县"},{"areacode":"011303","areaname":"宾川县"},{"areacode":"011304","areaname":"弥渡县"},{"areacode":"011305","areaname":"永平县"},{"areacode":"011306","areaname":"云龙县"},{"areacode":"011307","areaname":"洱源县"},{"areacode":"011308","areaname":"剑川县"},{"areacode":"011309","areaname":"鹤庆县"},{"areacode":"011310","areaname":"漾濞彝族自治县"},{"areacode":"011311","areaname":"南涧彝族自治县"},{"areacode":"011312","areaname":"巍山彝族回族自治县"}]},{"name":"德宏傣族景颇族自治州","si":"D","abbr":"DHDU","fp":"DEHONGDAIZ","provinceCode":1,"cityCode":114,"arealist":[{"areacode":"011401","areaname":"瑞丽市"},{"areacode":"011402","areaname":"潞西市"},{"areacode":"011403","areaname":"梁河县"},{"areacode":"011404","areaname":"盈江县"},{"areacode":"011405","areaname":"陇川县"}]},{"name":"迪庆藏族自治州","si":"D","abbr":"DQZ","fp":"DIQINGZANGZU","provinceCode":1,"cityCode":116,"arealist":[{"areacode":"011601","areaname":"香格里拉市"},{"areacode":"011602","areaname":"德钦县"},{"areacode":"011603","areaname":"维西傈僳族自治县"}]},{"name":"红河哈尼族彝族自治州","si":"H","abbr":"HHHN","fp":"HONGHEHANIZU","provinceCode":1,"cityCode":110,"arealist":[{"areacode":"011001","areaname":"个旧市"},{"areacode":"011002","areaname":"开远市"},{"areacode":"011003","areaname":"蒙自市"},{"areacode":"011004","areaname":"弥勒市"},{"areacode":"011005","areaname":"绿春县"},{"areacode":"011006","areaname":"建水县"},{"areacode":"011007","areaname":"石屏县"},{"areacode":"011008","areaname":"泸西县"},{"areacode":"011009","areaname":"元阳县"},{"areacode":"011010","areaname":"红河县"},{"areacode":"011011","areaname":"金平苗族瑶族傣族自治县"},{"areacode":"011012","areaname":"屏边苗族自治县"},{"areacode":"011013","areaname":"河口瑶族自治县"}]},{"name":"昆明市","si":"K","abbr":"KM","fp":"KUNMING","provinceCode":1,"cityCode":101,"arealist":[{"areacode":"010101","areaname":"五华区"},{"areacode":"010102","areaname":"盘龙区"},{"areacode":"010103","areaname":"官渡区"},{"areacode":"010104","areaname":"西山区"},{"areacode":"010105","areaname":"东川区"},{"areacode":"010106","areaname":"呈贡区"},{"areacode":"010107","areaname":"安宁市"},{"areacode":"010108","areaname":"晋宁县"},{"areacode":"010109","areaname":"富民县"},{"areacode":"010110","areaname":"宜良县"},{"areacode":"010111","areaname":"嵩明县"},{"areacode":"010112","areaname":"石林彝族自治县"},{"areacode":"010113","areaname":"禄劝彝族苗族自治县"},{"areacode":"010114","areaname":"寻甸回族自治县"}]},{"name":"丽江市","si":"L","abbr":"LJ","fp":"LIJIANG","provinceCode":1,"cityCode":106,"arealist":[{"areacode":"010601","areaname":"古城区"},{"areacode":"010602","areaname":"永胜县"},{"areacode":"010603","areaname":"华坪县"},{"areacode":"010604","areaname":"玉龙纳西族自治县"},{"areacode":"010605","areaname":"宁蒗彝族自治县"}]},{"name":"临沧市","si":"L","abbr":"LC","fp":"LINCANG","provinceCode":1,"cityCode":108,"arealist":[{"areacode":"010801","areaname":"临翔区"},{"areacode":"010802","areaname":"凤庆县"},{"areacode":"010803","areaname":"云县"},{"areacode":"010804","areaname":"永德县"},{"areacode":"010805","areaname":"镇康县"},{"areacode":"010806","areaname":"双江拉祜族佤族布朗族傣族自治县"},{"areacode":"010807","areaname":"耿马傣族佤族治县"},{"areacode":"010808","areaname":"沧源佤族自治县"}]},{"name":"怒江傈僳族自治州","si":"N","abbr":"NJLL","fp":"NUJIANGLILI","provinceCode":1,"cityCode":115,"arealist":[{"areacode":"011501","areaname":"泸水县"},{"areacode":"011502","areaname":"福贡县"},{"areacode":"011503","areaname":"贡山独龙族怒族自治县"},{"areacode":"011504","areaname":"兰坪白族普米族自治县"}]},{"name":"普洱市","si":"P","abbr":"PE","fp":"PUER","provinceCode":1,"cityCode":107,"arealist":[{"areacode":"010701","areaname":"思茅区"},{"areacode":"010702","areaname":"宁洱哈尼族彝族自治县"},{"areacode":"010703","areaname":"墨江哈尼族自治县"},{"areacode":"010704","areaname":"景东彝族自治县"},{"areacode":"010705","areaname":"景谷彝族傣族自治县"},{"areacode":"010706","areaname":"镇沅彝族哈尼族拉祜族自治县"},{"areacode":"010707","areaname":"江城哈尼族彝族自治县"},{"areacode":"010708","areaname":"孟连傣族拉祜族佤族自治县"},{"areacode":"010709","areaname":"澜沧拉祜族自治县"},{"areacode":"010710","areaname":"西盟佤族自治县"}]},{"name":"曲靖市","si":"Q","abbr":"QJ","fp":"QUJING","provinceCode":1,"cityCode":102,"arealist":[{"areacode":"010201","areaname":"麒麟区"},{"areacode":"010202","areaname":"宣威市"},{"areacode":"010203","areaname":"马龙县"},{"areacode":"010204","areaname":"陆良县"},{"areacode":"010205","areaname":"师宗县"},{"areacode":"010206","areaname":"罗平县"},{"areacode":"010207","areaname":"富源县"},{"areacode":"010208","areaname":"会泽县"},{"areacode":"010209","areaname":"沾益县"}]},{"name":"深圳市","si":"S","abbr":"SZ","fp":"SHENZHEN","provinceCode":15,"cityCode":1501,"arealist":[{"areacode":"150101","areaname":"福田区"},{"areacode":"150102","areaname":"南山区"},{"areacode":"150103","areaname":"罗湖区"},{"areacode":"150104","areaname":"盐田区"},{"areacode":"150105","areaname":"宝安区"},{"areacode":"150106","areaname":"龙岗区"}]},{"name":"文山壮族苗族自治州","si":"W","abbr":"WSZZMZ","fp":"WENSHANZHUANGZUMIAOZU","provinceCode":1,"cityCode":111,"arealist":[{"areacode":"011101","areaname":"文山市"},{"areacode":"011102","areaname":"砚山县"},{"areacode":"011103","areaname":"西畴县"},{"areacode":"011104","areaname":"麻栗坡县"},{"areacode":"011105","areaname":"马关县"},{"areacode":"011106","areaname":"丘北县"},{"areacode":"011107","areaname":"广南县"},{"areacode":"011108","areaname":"富宁县"}]},{"name":"西双版纳傣族自治州","si":"X","abbr":"XSBL","fp":"HONGHEHANIXISHUANGBANL","provinceCode":1,"cityCode":112,"arealist":[{"areacode":"011201","areaname":"景洪市"},{"areacode":"011202","areaname":"勐海县"},{"areacode":"011203","areaname":"勐腊县"}]},{"name":"玉溪市","si":"Y","abbr":"YX","fp":"YUXI","provinceCode":1,"cityCode":103,"arealist":[{"areacode":"010301","areaname":"红塔区"},{"areacode":"010302","areaname":"江川区"},{"areacode":"010303","areaname":"澄江县"},{"areacode":"010304","areaname":"通海县"},{"areacode":"010305","areaname":"华宁县"},{"areacode":"010306","areaname":"易门县"},{"areacode":"010307","areaname":"峨山彝族自治县"},{"areacode":"010308","areaname":"新平彝族傣族自治县"},{"areacode":"010309","areaname":"元江哈尼族彝族傣族自治县"}]},{"name":"昭通市","si":"Z","abbr":"ZT","fp":"ZHAOTONG","provinceCode":1,"cityCode":105,"arealist":[{"areacode":"010501","areaname":"昭阳区"},{"areacode":"010502","areaname":"鲁甸县"},{"areacode":"010503","areaname":"巧家县"},{"areacode":"010504","areaname":"盐津县"},{"areacode":"010505","areaname":"大关县"},{"areacode":"010506","areaname":"永善县"},{"areacode":"010507","areaname":"绥江县"},{"areacode":"010508","areaname":"镇雄县"},{"areacode":"010509","areaname":"彝良县"},{"areacode":"010510","areaname":"威信县"},{"areacode":"010511","areaname":"水富县"}]}]}
     */

    public int code;
    public String msg;
    /**
     * timestamp : 1462273822
     * hotCity : [{"name":"保山市","si":"B","abbr":"BS","fp":"BAOSHAN","provinceCode":1,"cityCode":104,"arealist":[{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]},{"name":"昆明市","si":"K","abbr":"KM","fp":"KUNMING","provinceCode":1,"cityCode":101,"arealist":[{"areacode":"010101","areaname":"五华区"},{"areacode":"010102","areaname":"盘龙区"},{"areacode":"010103","areaname":"官渡区"},{"areacode":"010104","areaname":"西山区"},{"areacode":"010105","areaname":"东川区"},{"areacode":"010106","areaname":"呈贡区"},{"areacode":"010107","areaname":"安宁市"},{"areacode":"010108","areaname":"晋宁县"},{"areacode":"010109","areaname":"富民县"},{"areacode":"010110","areaname":"宜良县"},{"areacode":"010111","areaname":"嵩明县"},{"areacode":"010112","areaname":"石林彝族自治县"},{"areacode":"010113","areaname":"禄劝彝族苗族自治县"},{"areacode":"010114","areaname":"寻甸回族自治县"}]},{"name":"丽江市","si":"L","abbr":"LJ","fp":"LIJIANG","provinceCode":1,"cityCode":106,"arealist":[{"areacode":"010601","areaname":"古城区"},{"areacode":"010602","areaname":"永胜县"},{"areacode":"010603","areaname":"华坪县"},{"areacode":"010604","areaname":"玉龙纳西族自治县"},{"areacode":"010605","areaname":"宁蒗彝族自治县"}]},{"name":"普洱市","si":"P","abbr":"PE","fp":"PUER","provinceCode":1,"cityCode":107,"arealist":[{"areacode":"010701","areaname":"思茅区"},{"areacode":"010702","areaname":"宁洱哈尼族彝族自治县"},{"areacode":"010703","areaname":"墨江哈尼族自治县"},{"areacode":"010704","areaname":"景东彝族自治县"},{"areacode":"010705","areaname":"景谷彝族傣族自治县"},{"areacode":"010706","areaname":"镇沅彝族哈尼族拉祜族自治县"},{"areacode":"010707","areaname":"江城哈尼族彝族自治县"},{"areacode":"010708","areaname":"孟连傣族拉祜族佤族自治县"},{"areacode":"010709","areaname":"澜沧拉祜族自治县"},{"areacode":"010710","areaname":"西盟佤族自治县"}]},{"name":"曲靖市","si":"Q","abbr":"QJ","fp":"QUJING","provinceCode":1,"cityCode":102,"arealist":[{"areacode":"010201","areaname":"麒麟区"},{"areacode":"010202","areaname":"宣威市"},{"areacode":"010203","areaname":"马龙县"},{"areacode":"010204","areaname":"陆良县"},{"areacode":"010205","areaname":"师宗县"},{"areacode":"010206","areaname":"罗平县"},{"areacode":"010207","areaname":"富源县"},{"areacode":"010208","areaname":"会泽县"},{"areacode":"010209","areaname":"沾益县"}]},{"name":"深圳市","si":"S","abbr":"SZ","fp":"SHENZHEN","provinceCode":15,"cityCode":1501,"arealist":[{"areacode":"150101","areaname":"福田区"},{"areacode":"150102","areaname":"南山区"},{"areacode":"150103","areaname":"罗湖区"},{"areacode":"150104","areaname":"盐田区"},{"areacode":"150105","areaname":"宝安区"},{"areacode":"150106","areaname":"龙岗区"}]},{"name":"玉溪市","si":"Y","abbr":"YX","fp":"YUXI","provinceCode":1,"cityCode":103,"arealist":[{"areacode":"010301","areaname":"红塔区"},{"areacode":"010302","areaname":"江川区"},{"areacode":"010303","areaname":"澄江县"},{"areacode":"010304","areaname":"通海县"},{"areacode":"010305","areaname":"华宁县"},{"areacode":"010306","areaname":"易门县"},{"areacode":"010307","areaname":"峨山彝族自治县"},{"areacode":"010308","areaname":"新平彝族傣族自治县"},{"areacode":"010309","areaname":"元江哈尼族彝族傣族自治县"}]},{"name":"昭通市","si":"Z","abbr":"ZT","fp":"ZHAOTONG","provinceCode":1,"cityCode":105,"arealist":[{"areacode":"010501","areaname":"昭阳区"},{"areacode":"010502","areaname":"鲁甸县"},{"areacode":"010503","areaname":"巧家县"},{"areacode":"010504","areaname":"盐津县"},{"areacode":"010505","areaname":"大关县"},{"areacode":"010506","areaname":"永善县"},{"areacode":"010507","areaname":"绥江县"},{"areacode":"010508","areaname":"镇雄县"},{"areacode":"010509","areaname":"彝良县"},{"areacode":"010510","areaname":"威信县"},{"areacode":"010511","areaname":"水富县"}]}]
     * list : [{"name":"保山市","si":"B","abbr":"BS","fp":"BAOSHAN","provinceCode":1,"cityCode":104,"arealist":[{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]},{"name":"楚雄彝族自治州","si":"C","abbr":"CXYZ","fp":"CHUXIONGYIZU","provinceCode":1,"cityCode":109,"arealist":[{"areacode":"010901","areaname":"楚雄市"},{"areacode":"010902","areaname":"双柏县"},{"areacode":"010903","areaname":"牟定县"},{"areacode":"010904","areaname":"南华县"},{"areacode":"010905","areaname":"姚安县"},{"areacode":"010906","areaname":"大姚县"},{"areacode":"010907","areaname":"永仁县"},{"areacode":"010908","areaname":"元谋县"},{"areacode":"010909","areaname":"武定县"},{"areacode":"010910","areaname":"禄丰县"}]},{"name":"大理白族自治州","si":"D","abbr":"DLBZU","fp":"DALI","provinceCode":1,"cityCode":113,"arealist":[{"areacode":"011301","areaname":"大理市"},{"areacode":"011302","areaname":"祥云县"},{"areacode":"011303","areaname":"宾川县"},{"areacode":"011304","areaname":"弥渡县"},{"areacode":"011305","areaname":"永平县"},{"areacode":"011306","areaname":"云龙县"},{"areacode":"011307","areaname":"洱源县"},{"areacode":"011308","areaname":"剑川县"},{"areacode":"011309","areaname":"鹤庆县"},{"areacode":"011310","areaname":"漾濞彝族自治县"},{"areacode":"011311","areaname":"南涧彝族自治县"},{"areacode":"011312","areaname":"巍山彝族回族自治县"}]},{"name":"德宏傣族景颇族自治州","si":"D","abbr":"DHDU","fp":"DEHONGDAIZ","provinceCode":1,"cityCode":114,"arealist":[{"areacode":"011401","areaname":"瑞丽市"},{"areacode":"011402","areaname":"潞西市"},{"areacode":"011403","areaname":"梁河县"},{"areacode":"011404","areaname":"盈江县"},{"areacode":"011405","areaname":"陇川县"}]},{"name":"迪庆藏族自治州","si":"D","abbr":"DQZ","fp":"DIQINGZANGZU","provinceCode":1,"cityCode":116,"arealist":[{"areacode":"011601","areaname":"香格里拉市"},{"areacode":"011602","areaname":"德钦县"},{"areacode":"011603","areaname":"维西傈僳族自治县"}]},{"name":"红河哈尼族彝族自治州","si":"H","abbr":"HHHN","fp":"HONGHEHANIZU","provinceCode":1,"cityCode":110,"arealist":[{"areacode":"011001","areaname":"个旧市"},{"areacode":"011002","areaname":"开远市"},{"areacode":"011003","areaname":"蒙自市"},{"areacode":"011004","areaname":"弥勒市"},{"areacode":"011005","areaname":"绿春县"},{"areacode":"011006","areaname":"建水县"},{"areacode":"011007","areaname":"石屏县"},{"areacode":"011008","areaname":"泸西县"},{"areacode":"011009","areaname":"元阳县"},{"areacode":"011010","areaname":"红河县"},{"areacode":"011011","areaname":"金平苗族瑶族傣族自治县"},{"areacode":"011012","areaname":"屏边苗族自治县"},{"areacode":"011013","areaname":"河口瑶族自治县"}]},{"name":"昆明市","si":"K","abbr":"KM","fp":"KUNMING","provinceCode":1,"cityCode":101,"arealist":[{"areacode":"010101","areaname":"五华区"},{"areacode":"010102","areaname":"盘龙区"},{"areacode":"010103","areaname":"官渡区"},{"areacode":"010104","areaname":"西山区"},{"areacode":"010105","areaname":"东川区"},{"areacode":"010106","areaname":"呈贡区"},{"areacode":"010107","areaname":"安宁市"},{"areacode":"010108","areaname":"晋宁县"},{"areacode":"010109","areaname":"富民县"},{"areacode":"010110","areaname":"宜良县"},{"areacode":"010111","areaname":"嵩明县"},{"areacode":"010112","areaname":"石林彝族自治县"},{"areacode":"010113","areaname":"禄劝彝族苗族自治县"},{"areacode":"010114","areaname":"寻甸回族自治县"}]},{"name":"丽江市","si":"L","abbr":"LJ","fp":"LIJIANG","provinceCode":1,"cityCode":106,"arealist":[{"areacode":"010601","areaname":"古城区"},{"areacode":"010602","areaname":"永胜县"},{"areacode":"010603","areaname":"华坪县"},{"areacode":"010604","areaname":"玉龙纳西族自治县"},{"areacode":"010605","areaname":"宁蒗彝族自治县"}]},{"name":"临沧市","si":"L","abbr":"LC","fp":"LINCANG","provinceCode":1,"cityCode":108,"arealist":[{"areacode":"010801","areaname":"临翔区"},{"areacode":"010802","areaname":"凤庆县"},{"areacode":"010803","areaname":"云县"},{"areacode":"010804","areaname":"永德县"},{"areacode":"010805","areaname":"镇康县"},{"areacode":"010806","areaname":"双江拉祜族佤族布朗族傣族自治县"},{"areacode":"010807","areaname":"耿马傣族佤族治县"},{"areacode":"010808","areaname":"沧源佤族自治县"}]},{"name":"怒江傈僳族自治州","si":"N","abbr":"NJLL","fp":"NUJIANGLILI","provinceCode":1,"cityCode":115,"arealist":[{"areacode":"011501","areaname":"泸水县"},{"areacode":"011502","areaname":"福贡县"},{"areacode":"011503","areaname":"贡山独龙族怒族自治县"},{"areacode":"011504","areaname":"兰坪白族普米族自治县"}]},{"name":"普洱市","si":"P","abbr":"PE","fp":"PUER","provinceCode":1,"cityCode":107,"arealist":[{"areacode":"010701","areaname":"思茅区"},{"areacode":"010702","areaname":"宁洱哈尼族彝族自治县"},{"areacode":"010703","areaname":"墨江哈尼族自治县"},{"areacode":"010704","areaname":"景东彝族自治县"},{"areacode":"010705","areaname":"景谷彝族傣族自治县"},{"areacode":"010706","areaname":"镇沅彝族哈尼族拉祜族自治县"},{"areacode":"010707","areaname":"江城哈尼族彝族自治县"},{"areacode":"010708","areaname":"孟连傣族拉祜族佤族自治县"},{"areacode":"010709","areaname":"澜沧拉祜族自治县"},{"areacode":"010710","areaname":"西盟佤族自治县"}]},{"name":"曲靖市","si":"Q","abbr":"QJ","fp":"QUJING","provinceCode":1,"cityCode":102,"arealist":[{"areacode":"010201","areaname":"麒麟区"},{"areacode":"010202","areaname":"宣威市"},{"areacode":"010203","areaname":"马龙县"},{"areacode":"010204","areaname":"陆良县"},{"areacode":"010205","areaname":"师宗县"},{"areacode":"010206","areaname":"罗平县"},{"areacode":"010207","areaname":"富源县"},{"areacode":"010208","areaname":"会泽县"},{"areacode":"010209","areaname":"沾益县"}]},{"name":"深圳市","si":"S","abbr":"SZ","fp":"SHENZHEN","provinceCode":15,"cityCode":1501,"arealist":[{"areacode":"150101","areaname":"福田区"},{"areacode":"150102","areaname":"南山区"},{"areacode":"150103","areaname":"罗湖区"},{"areacode":"150104","areaname":"盐田区"},{"areacode":"150105","areaname":"宝安区"},{"areacode":"150106","areaname":"龙岗区"}]},{"name":"文山壮族苗族自治州","si":"W","abbr":"WSZZMZ","fp":"WENSHANZHUANGZUMIAOZU","provinceCode":1,"cityCode":111,"arealist":[{"areacode":"011101","areaname":"文山市"},{"areacode":"011102","areaname":"砚山县"},{"areacode":"011103","areaname":"西畴县"},{"areacode":"011104","areaname":"麻栗坡县"},{"areacode":"011105","areaname":"马关县"},{"areacode":"011106","areaname":"丘北县"},{"areacode":"011107","areaname":"广南县"},{"areacode":"011108","areaname":"富宁县"}]},{"name":"西双版纳傣族自治州","si":"X","abbr":"XSBL","fp":"HONGHEHANIXISHUANGBANL","provinceCode":1,"cityCode":112,"arealist":[{"areacode":"011201","areaname":"景洪市"},{"areacode":"011202","areaname":"勐海县"},{"areacode":"011203","areaname":"勐腊县"}]},{"name":"玉溪市","si":"Y","abbr":"YX","fp":"YUXI","provinceCode":1,"cityCode":103,"arealist":[{"areacode":"010301","areaname":"红塔区"},{"areacode":"010302","areaname":"江川区"},{"areacode":"010303","areaname":"澄江县"},{"areacode":"010304","areaname":"通海县"},{"areacode":"010305","areaname":"华宁县"},{"areacode":"010306","areaname":"易门县"},{"areacode":"010307","areaname":"峨山彝族自治县"},{"areacode":"010308","areaname":"新平彝族傣族自治县"},{"areacode":"010309","areaname":"元江哈尼族彝族傣族自治县"}]},{"name":"昭通市","si":"Z","abbr":"ZT","fp":"ZHAOTONG","provinceCode":1,"cityCode":105,"arealist":[{"areacode":"010501","areaname":"昭阳区"},{"areacode":"010502","areaname":"鲁甸县"},{"areacode":"010503","areaname":"巧家县"},{"areacode":"010504","areaname":"盐津县"},{"areacode":"010505","areaname":"大关县"},{"areacode":"010506","areaname":"永善县"},{"areacode":"010507","areaname":"绥江县"},{"areacode":"010508","areaname":"镇雄县"},{"areacode":"010509","areaname":"彝良县"},{"areacode":"010510","areaname":"威信县"},{"areacode":"010511","areaname":"水富县"}]}]
     */

    public DataBean data;

    public static class DataBean implements Serializable{
        public int timestamp;
        /**
         * name : 保山市
         * si : B
         * abbr : BS
         * fp : BAOSHAN
         * provinceCode : 1
         * cityCode : 104
         * arealist : [{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]
         */

        public List<HotCityBean> hotCity;
        /**
         * name : 保山市
         * si : B
         * abbr : BS
         * fp : BAOSHAN
         * provinceCode : 1
         * cityCode : 104
         * arealist : [{"areacode":"010401","areaname":"隆阳区"},{"areacode":"010402","areaname":"腾冲市"},{"areacode":"010403","areaname":"施甸县"},{"areacode":"010404","areaname":"龙陵县"},{"areacode":"010405","areaname":"昌宁县"}]
         */

        public List<ListBean> list;

        public static class HotCityBean implements Serializable{
            public String name;
            public String si;
            public String abbr;
            public String fp;
            public int provinceCode;
            public int cityCode;
            /**
             * areacode : 010401
             * areaname : 隆阳区
             */

            public List<ArealistBean> arealist;

            public static class ArealistBean implements Serializable{
                public String areacode;
                public String areaname;
            }
        }

        public static class ListBean implements Serializable{
            public String name;
            public String si;
            public String abbr;
            public String fp;
            public int provinceCode;
            public int cityCode;
            /**
             * areacode : 010401
             * areaname : 隆阳区
             */

            public List<ArealistBean> arealist;

            public static class ArealistBean implements Serializable{
                public String areacode;
                public String areaname;
            }
        }
    }
}
