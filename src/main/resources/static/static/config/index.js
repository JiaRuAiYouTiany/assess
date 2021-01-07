;(function () {
    window.SITE_CONFIG = {};
  
    // api接口请求地址
    window.SITE_CONFIG['baseUrl'] = 'http://localhost:9099/assess';
    window.SITE_CONFIG['frontend'] = 'http://localhost:8082';
  
    // window.SITE_CONFIG['baseUrl'] = 'https://api.sport.ljnewmap.cn/sporttracker';
    // window.SITE_CONFIG['frontend'] = 'https://sport.ljnewmap.cn/';
  
    window.MAPSEARCH_URL = "https://api.tianditu.gov.cn";
    // cdn地址 = 域名 + 版本号
    window.SITE_CONFIG['domain']  = './'; // 域名
    window.SITE_CONFIG['version'] = '';   // 版本号(年月日时分)
    window.SITE_CONFIG['cdnUrl']  = window.SITE_CONFIG.domain + window.SITE_CONFIG.version;
  })();