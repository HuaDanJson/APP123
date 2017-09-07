package com.example.json.app123;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.json.app123.constants.ConsPackage;
import com.example.json.app123.constants.ConsTitle;
import com.example.json.app123.constants.ConstKey;
import com.example.json.app123.constants.ConstPath;
import com.example.json.app123.util.ToastHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.crdMainActivityBaiDu)
    CardView crdMainActivityBaiDu;
    @BindView(R.id.crdMainActivityQQ)
    CardView crdMainActivityQQ;
    @BindView(R.id.crdMainActivityWeiXin)
    CardView crdMainActivityWeiXin;
    @BindView(R.id.crdMainActivityXinLang)
    CardView crdMainActivityXinLang;
    @BindView(R.id.crdMainActivityBaiDuMap)
    CardView crdMainActivityBaiDuMap;
    @BindView(R.id.crdMainActivityDiDi)
    CardView crdMainActivityDiDi;
    @BindView(R.id.tvWebViewActivityTitle)
    TextView tvWebViewActivityTitle;
    @BindView(R.id.crdMainActivityAiQiYi)
    CardView crdMainActivityAiQiYi;
    @BindView(R.id.crdMainActivityKUGou)
    CardView crdMainActivityKUGou;
    @BindView(R.id.crdMainActivityQunMinKGe)
    CardView crdMainActivityQunMinKGe;
    @BindView(R.id.crdMainActivity58)
    CardView crdMainActivity58;
    @BindView(R.id.crdMainActivity12306)
    CardView crdMainActivity12306;
    @BindView(R.id.crdMainActivityAnJvKe)
    CardView crdMainActivityAnJvKe;
    @BindView(R.id.crdMainActivityBaiDuWaiMai)
    CardView crdMainActivityBaiDuWaiMai;
    @BindView(R.id.crdMainActivityBiliBiLi)
    CardView crdMainActivityBiliBiLi;
    @BindView(R.id.crdMainActivityErLeMe)
    CardView crdMainActivityErLeMe;
    @BindView(R.id.crdMainActivityFangTianXia)
    CardView crdMainActivityFangTianXia;
    @BindView(R.id.crdMainActivityGanJi)
    CardView crdMainActivityGanJi;
    @BindView(R.id.crdMainActivityGaoDeMap)
    CardView crdMainActivityGaoDeMap;
    @BindView(R.id.crdMainActivityHelpHomeWork)
    CardView crdMainActivityHelpHomeWork;
    @BindView(R.id.crdMainActivityJinRiTouTiao)
    CardView crdMainActivityJinRiTouTiao;
    @BindView(R.id.crdMainActivityJingDong)
    CardView crdMainActivityJingDong;
    @BindView(R.id.crdMainActivityKuaiShou)
    CardView crdMainActivityKuaiShou;
    @BindView(R.id.crdMainActivityMeiTuXiuXiu)
    CardView crdMainActivityMeiTuXiuXiu;
    @BindView(R.id.crdMainActivityMeiTuan)
    CardView crdMainActivityMeiTuan;
    @BindView(R.id.crdMainActivityMeiTuanWaiMai)
    CardView crdMainActivityMeiTuanWaiMai;
    @BindView(R.id.crdMainActivityMoMo)
    CardView crdMainActivityMoMo;
    @BindView(R.id.crdMainActivityMyWorld)
    CardView crdMainActivityMyWorld;
    @BindView(R.id.crdMainActivityOfo)
    CardView crdMainActivityOfo;
    @BindView(R.id.crdMainActivityGoWhere)
    CardView crdMainActivityGoWhere;
    @BindView(R.id.crdMainActivityTaoBao)
    CardView crdMainActivityTaoBao;
    @BindView(R.id.crdMainActivityTenXunVideo)
    CardView crdMainActivityTenXunVideo;
    @BindView(R.id.crdMainActivityUC)
    CardView crdMainActivityUC;
    @BindView(R.id.crdMainActivityWanNengKey)
    CardView crdMainActivityWanNengKey;
    @BindView(R.id.crdMainActivityWangZhe)
    CardView crdMainActivityWangZhe;
    @BindView(R.id.crdMainActivityXiaMiMusic)
    CardView crdMainActivityXiaMiMusic;
    @BindView(R.id.crdMainActivityXieCheng)
    CardView crdMainActivityXieCheng;
    @BindView(R.id.crdMainActivityYouKu)
    CardView crdMainActivityYouKu;
    @BindView(R.id.crdMainActivityZhiFuBao)
    CardView crdMainActivityZhiFuBao;
    @BindView(R.id.crdMainActivityZhuanZhuan)
    CardView crdMainActivityZhuanZhuan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    public void initView() {
        crdMainActivityBaiDu.setOnClickListener(this);
        crdMainActivityQQ.setOnClickListener(this);
        crdMainActivityWeiXin.setOnClickListener(this);
        crdMainActivityXinLang.setOnClickListener(this);
        crdMainActivityBaiDuMap.setOnClickListener(this);
        crdMainActivityDiDi.setOnClickListener(this);
        crdMainActivityAiQiYi.setOnClickListener(this);
        crdMainActivityKUGou.setOnClickListener(this);
        crdMainActivityQunMinKGe.setOnClickListener(this);
        crdMainActivity58.setOnClickListener(this);
        crdMainActivity12306.setOnClickListener(this);
        crdMainActivityAnJvKe.setOnClickListener(this);
        crdMainActivityBaiDuWaiMai.setOnClickListener(this);
        crdMainActivityBiliBiLi.setOnClickListener(this);
        crdMainActivityErLeMe.setOnClickListener(this);
        crdMainActivityFangTianXia.setOnClickListener(this);
        crdMainActivityGanJi.setOnClickListener(this);
        crdMainActivityGaoDeMap.setOnClickListener(this);
        crdMainActivityHelpHomeWork.setOnClickListener(this);
        crdMainActivityJinRiTouTiao.setOnClickListener(this);
        crdMainActivityJingDong.setOnClickListener(this);
        crdMainActivityKuaiShou.setOnClickListener(this);
        crdMainActivityMeiTuXiuXiu.setOnClickListener(this);
        crdMainActivityMeiTuan.setOnClickListener(this);
        crdMainActivityMeiTuanWaiMai.setOnClickListener(this);
        crdMainActivityMoMo.setOnClickListener(this);
        crdMainActivityMyWorld.setOnClickListener(this);
        crdMainActivityOfo.setOnClickListener(this);
        crdMainActivityGoWhere.setOnClickListener(this);
        crdMainActivityTaoBao.setOnClickListener(this);
        crdMainActivityTenXunVideo.setOnClickListener(this);
        crdMainActivityUC.setOnClickListener(this);
        crdMainActivityWanNengKey.setOnClickListener(this);
        crdMainActivityWangZhe.setOnClickListener(this);
        crdMainActivityXiaMiMusic.setOnClickListener(this);
        crdMainActivityXieCheng.setOnClickListener(this);
        crdMainActivityYouKu.setOnClickListener(this);
        crdMainActivityZhiFuBao.setOnClickListener(this);
        crdMainActivityZhuanZhuan.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.crdMainActivityBaiDu:
                doStartApplicationWithPackageName(ConsPackage.BAI_DU_PACKAGE, ConsTitle.BAI_DU_NAME, ConstPath.BAI_DU_URL, "http://shouji.baidu.com/software/11581131.html");
                break;
            case R.id.crdMainActivityQQ:
                doStartApplicationWithPackageName(ConsPackage.QQ_PACKAGE, ConsTitle.QQ_NAME, "http://web.qq.com", "http://shouji.baidu.com/software/11622374.html");
                break;
            case R.id.crdMainActivityWeiXin:
                doStartApplicationWithPackageName("com.tencent.mm", "微信", "https://wx.qq.com/", "http://shouji.baidu.com/software/11643951.html");
                break;
            case R.id.crdMainActivityXinLang:
                doStartApplicationWithPackageName("com.sina.weibo", "微博", "http://weibo.com/", "http://shouji.baidu.com/software/11734760.html");
                break;
            case R.id.crdMainActivityBaiDuMap:
                doStartApplicationWithPackageName("com.baidu.BaiduMap", "百度地图", "http://map.baidu.com/", "http://shouji.baidu.com/software/11629423.html");
                break;
            case R.id.crdMainActivityDiDi:
                doStartApplicationWithPackageName("com.sdu.didi.psnger", "滴滴出行", "http://www.xiaojukeji.com/index/index", "http://shouji.baidu.com/software/11734600.html");
                break;
            case R.id.crdMainActivityAiQiYi:
                doStartApplicationWithPackageName("ocom.qiyi.vide", "爱奇艺", "http://www.iqiyi.com/", "http://shouji.baidu.com/software/11595643.html");
                break;
            case R.id.crdMainActivityKUGou:
                doStartApplicationWithPackageName("com.kugou.android", "酷狗音乐", "http://www.kugou.com/", "http://shouji.baidu.com/software/11501505.html");
                break;
            case R.id.crdMainActivityQunMinKGe:
                doStartApplicationWithPackageName("com.tencent.karaoke", "全民K歌", "http://kg.qq.com/", "http://shouji.baidu.com/software/11676910.html");
                break;

            case R.id.crdMainActivity58:
                doStartApplicationWithPackageName("com.wuba", "58同城", "http://bj.58.com/", "http://shouji.baidu.com/software/11676910.html");
                break;
            case R.id.crdMainActivity12306:
                doStartApplicationWithPackageName("com.MobileTicket", "12306", "http://www.12306.cn/mormhweb/", "http://shouji.baidu.com/software/10314150.html");

                break;
            case R.id.crdMainActivityAnJvKe:
                doStartApplicationWithPackageName("com.anjuke.android.app", "安居客", "https://beijing.anjuke.com/", "http://shouji.baidu.com/software/11660296.html");
                break;
            case R.id.crdMainActivityBaiDuWaiMai:
                doStartApplicationWithPackageName("com.baidu.lbs.waimai", "百度外卖", "http://waimai.baidu.com/waimai?qt=find", "http://shouji.baidu.com/software/11772836.html");
                break;
            case R.id.crdMainActivityBiliBiLi:
                doStartApplicationWithPackageName("tv.danmaku.bili", "哔哩哔哩", "https://www.bilibili.com/", "http://shouji.baidu.com/software/11824822.html");
                break;
            case R.id.crdMainActivityErLeMe:
                doStartApplicationWithPackageName("me.ele", "饿了么", "https://www.ele.me/", "http://shouji.baidu.com/software/11802650.html");
                break;
            case R.id.crdMainActivityFangTianXia:
                doStartApplicationWithPackageName("com.soufun.app", "房天下", "http://hn.fang.com/?s=BDPZ-BL", "http://shouji.baidu.com/software/11804544.html");
                break;
            case R.id.crdMainActivityGanJi:
                doStartApplicationWithPackageName("com.ganji.android", "赶集网", "http://bj.ganji.com/", "http://shouji.baidu.com/software/11711733.html");
                break;
            case R.id.crdMainActivityGaoDeMap:
                doStartApplicationWithPackageName("com.autonavi.minimap", "高德地图", "http://ditu.amap.com/", "http://shouji.baidu.com/software/11782193.html");
                break;
            case R.id.crdMainActivityHelpHomeWork:
                doStartApplicationWithPackageName("com.baidu.homework", "作业帮", "https://www.zybang.com/", "http://shouji.baidu.com/software/11819297.html");
                break;
            case R.id.crdMainActivityJinRiTouTiao:
                doStartApplicationWithPackageName("com.ss.android.article.news", "今日头条", "http://www.toutiao.com/", "http://shouji.baidu.com/software/11803309.html");
                break;
            case R.id.crdMainActivityKuaiShou:
                doStartApplicationWithPackageName("com.smile.gifmaker", "快手", "https://www.kuaishou.com/", "http://shouji.baidu.com/software/11818719.html");
                break;
            case R.id.crdMainActivityMeiTuXiuXiu:
                doStartApplicationWithPackageName("com.mt.mtxx.mtxx", "美图秀秀", "http://xiuxiu.web.meitu.com/", "http://shouji.baidu.com/software/11761420.html");
                break;
            case R.id.crdMainActivityMeiTuan:
                doStartApplicationWithPackageName("com.sankuai.meituan", "美团", "http://bj.meituan.com", "http://shouji.baidu.com/software/11715591.html");
                break;
            case R.id.crdMainActivityMeiTuanWaiMai:
                doStartApplicationWithPackageName("com.sankuai.meituan.takeoutnew", "美团外卖", "http://waimai.meituan.com/", "http://shouji.baidu.com/software/11661772.html");
                break;
            case R.id.crdMainActivityMoMo:
                doStartApplicationWithPackageName("com.immomo.momo", "MOMO陌陌", "https://web.immomo.com/", "http://shouji.baidu.com/software/11824702.html");
                break;
            case R.id.crdMainActivityMyWorld:
                doStartApplicationWithPackageName("com.mojang.minecraftpe", "我的世界", "http://mc.163.com/", "http://shouji.baidu.com/game/6891754.html");
                break;
            case R.id.crdMainActivityOfo:
                doStartApplicationWithPackageName("so.ofo.labofo", "ofo小黄车", "http://www.ofo.so/?utm_source=baidu&utm_medium=pz", "http://shouji.baidu.com/game/11818739.html");
                break;
            case R.id.crdMainActivityGoWhere:
                doStartApplicationWithPackageName("com.Qunar", "去哪儿旅行", "https://www.qunar.com/?tab=hotel&ex_track=auto_4e0d874a", "http://shouji.baidu.com/game/11774994.html");
                break;
            case R.id.crdMainActivityTaoBao:
                doStartApplicationWithPackageName("com.taobao.taobao", "淘宝", "https://www.taobao.com/", "http://shouji.baidu.com/game/11778092.html");
                break;
            case R.id.crdMainActivityTenXunVideo:
                doStartApplicationWithPackageName("com.tencent.qqlive", "腾讯视频", "https://v.qq.com/", "http://shouji.baidu.com/game/11727247.html");
                break;
            case R.id.crdMainActivityUC:
                doStartApplicationWithPackageName("com.UCMobile", "UC浏览器", "http://www.uc.cn/", "http://shouji.baidu.com/software/7871644.html");
                break;
            case R.id.crdMainActivityWanNengKey:
                doStartApplicationWithPackageName("com.snda.wifilocating", "WiFi万能钥匙", "https://www.wifi.com/", "http://shouji.baidu.com/software/11791347.html");
                break;
            case R.id.crdMainActivityWangZhe:
                doStartApplicationWithPackageName("com.tencent.tmgp.sgame", "王者荣耀", "http://pvp.qq.com/", "http://shouji.baidu.com/game/11792409.html");
                break;
            case R.id.crdMainActivityXiaMiMusic:
                doStartApplicationWithPackageName("fm.xiami.main", "虾米音乐", "http://bd.kuwo.cn/yinyue/506079?from=baidu", "http://shouji.baidu.com/software/11765689.html");
                break;
            case R.id.crdMainActivityXieCheng:
                doStartApplicationWithPackageName("ctrip.android.view", "携程旅行", "http://www.ctrip.com/?utm_source=baidu&utm_medium=cpc&utm_campaign=baidu81&campaign=CHNbaidu81&adid=index&gclid=&isctrip=T", "http://shouji.baidu.com/software/11807590.html");
                break;
            case R.id.crdMainActivityYouKu:
                doStartApplicationWithPackageName("com.youku.phone", "优酷", "http://www.youku.com/", "http://shouji.baidu.com/software/11778807.html");
                break;
            case R.id.crdMainActivityZhiFuBao:
                doStartApplicationWithPackageName("com.eg.android.AlipayGphone", "支付宝", "https://www.alipay.com/", "http://shouji.baidu.com/software/11735170.html");
                break;
            case R.id.crdMainActivityZhuanZhuan:
                doStartApplicationWithPackageName("com.wuba.zhuanzhuan", "转转", "http://zhuanzhuan.58.com/?zzfrom=baidubradingPC1&zhuanzhuanSourceFrom=1223", "http://shouji.baidu.com/software/11767950.html");
                break;
        }
    }

    private void doStartApplicationWithPackageName(String packagename, String title, String netURL, String downLoadAPKURL) {
        // 通过包名获取此APP详细信息，包括Activities、services、versioncode、name等等
        PackageInfo packageinfo = null;
        try {
            packageinfo = getPackageManager().getPackageInfo(packagename, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageinfo == null) {

            showMyDialog(title, downLoadAPKURL, netURL);

        } else {
            ToastHelper.showShortMessage("即将打开手机" + title);
            startAPP(packageinfo);
        }
    }

    public void startAPP(PackageInfo packageinfo) {
        // 创建一个类别为CATEGORY_LAUNCHER的该包名的Intent
        Intent resolveIntent = new Intent(Intent.ACTION_MAIN, null);
        resolveIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        resolveIntent.setPackage(packageinfo.packageName);

        // 通过getPackageManager()的queryIntentActivities方法遍历
        List<ResolveInfo> resolveinfoList = getPackageManager()
                .queryIntentActivities(resolveIntent, 0);

        ResolveInfo resolveinfo = resolveinfoList.iterator().next();
        if (resolveinfo != null) {
            // packagename = 参数packname
            String packageName = resolveinfo.activityInfo.packageName;
            // 这个就是我们要找的该APP的LAUNCHER的Activity[组织形式：packagename.mainActivityname]
            String className = resolveinfo.activityInfo.name;
            // LAUNCHER Intent
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);

            // 设置ComponentName参数1:packagename参数2:MainActivity路径
            ComponentName cn = new ComponentName(packageName, className);
            intent.setComponent(cn);
            startActivity(intent);
        }
    }

    public void showMyDialog(final String title, final String downLoadAPKURL, final String netURL) {
        final View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.main_activity_down_load_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.show();
        view.findViewById(R.id.llAgreementTerms).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewDownLoadAPKActivity.class);
                intent.putExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_DOWN_LOAD_APK_ACTIVITY_URL, downLoadAPKURL);
                startActivity(intent);
                alertDialog.dismiss();
            }
        });

        view.findViewById(R.id.llAgreementPrivacy).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_ACTIVITY_TITLE, "网页版" + title);
                intent.putExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_ACTIVITY_URL, netURL);
                startActivity(intent);
                alertDialog.dismiss();
            }
        });

        view.findViewById(R.id.llAgreementCancel).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
}
