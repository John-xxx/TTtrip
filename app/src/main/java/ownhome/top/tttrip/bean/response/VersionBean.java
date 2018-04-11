package ownhome.top.tttrip.bean.response;

/**
 * date：2018/4/11 9:32
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class VersionBean {
    /**
     * isSuccess : true
     * errorInfo :
     * data : {"createTime":{"date":30,"day":5,"hours":17,"minutes":32,"month":2,"seconds":8,"time":1522402328000,"timezoneOffset":-480,"year":118},"downloadUrl":"\\files\\app\\20180330173208764000de0000.apk","id":"20180330173208","isMustUpdate":0,"page":{"currentPage":0,"currentResult":0,"entityOrField":false,"ly":"","pageStr":"","showCount":6,"totalPage":0,"totalResult":0},"versionCode":"1010331","versionDesc":"æ\u0096°ç\u0089\u0088æµ\u008bè¯\u0095ç\u0089\u0088ï¼\u0081"}
     */

    private boolean isSuccess;
    private String errorInfo;
    private DataBean data;

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * createTime : {"date":30,"day":5,"hours":17,"minutes":32,"month":2,"seconds":8,"time":1522402328000,"timezoneOffset":-480,"year":118}
         * downloadUrl : \files\app\20180330173208764000de0000.apk
         * id : 20180330173208
         * isMustUpdate : 0
         * page : {"currentPage":0,"currentResult":0,"entityOrField":false,"ly":"","pageStr":"","showCount":6,"totalPage":0,"totalResult":0}
         * versionCode : 1010331
         * versionDesc : æ°çæµè¯çï¼
         */

        private CreateTimeBean createTime;
        private String downloadUrl;
        private String id;
        private int isMustUpdate;
        private PageBean page;
        private String versionCode;
        private String versionDesc;

        public CreateTimeBean getCreateTime() {
            return createTime;
        }

        public void setCreateTime(CreateTimeBean createTime) {
            this.createTime = createTime;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getIsMustUpdate() {
            return isMustUpdate;
        }

        public void setIsMustUpdate(int isMustUpdate) {
            this.isMustUpdate = isMustUpdate;
        }

        public PageBean getPage() {
            return page;
        }

        public void setPage(PageBean page) {
            this.page = page;
        }

        public String getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(String versionCode) {
            this.versionCode = versionCode;
        }

        public String getVersionDesc() {
            return versionDesc;
        }

        public void setVersionDesc(String versionDesc) {
            this.versionDesc = versionDesc;
        }

        public static class CreateTimeBean {
            /**
             * date : 30
             * day : 5
             * hours : 17
             * minutes : 32
             * month : 2
             * seconds : 8
             * time : 1522402328000
             * timezoneOffset : -480
             * year : 118
             */

            private int date;
            private int day;
            private int hours;
            private int minutes;
            private int month;
            private int seconds;
            private long time;
            private int timezoneOffset;
            private int year;

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }

        public static class PageBean {
            /**
             * currentPage : 0
             * currentResult : 0
             * entityOrField : false
             * ly :
             * pageStr :
             * showCount : 6
             * totalPage : 0
             * totalResult : 0
             */

            private int currentPage;
            private int currentResult;
            private boolean entityOrField;
            private String ly;
            private String pageStr;
            private int showCount;
            private int totalPage;
            private int totalResult;

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getCurrentResult() {
                return currentResult;
            }

            public void setCurrentResult(int currentResult) {
                this.currentResult = currentResult;
            }

            public boolean isEntityOrField() {
                return entityOrField;
            }

            public void setEntityOrField(boolean entityOrField) {
                this.entityOrField = entityOrField;
            }

            public String getLy() {
                return ly;
            }

            public void setLy(String ly) {
                this.ly = ly;
            }

            public String getPageStr() {
                return pageStr;
            }

            public void setPageStr(String pageStr) {
                this.pageStr = pageStr;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getTotalPage() {
                return totalPage;
            }

            public void setTotalPage(int totalPage) {
                this.totalPage = totalPage;
            }

            public int getTotalResult() {
                return totalResult;
            }

            public void setTotalResult(int totalResult) {
                this.totalResult = totalResult;
            }
        }
    }
}
