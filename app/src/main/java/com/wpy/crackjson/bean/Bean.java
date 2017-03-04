package com.wpy.crackjson.bean;

import java.util.List;

/**
 * Created by dell on 2017/3/4.
 */

public class Bean {

    private boolean result;
    private String code;
    private String message;
    private List<DataBeanHeadline> data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBeanHeadline> getData() {
        return data;
    }

    public void setData(List<DataBeanHeadline> data) {
        this.data = data;
    }

    public static class DataBeanHeadline {

        private CodeVersionBeanHeadline codeVersion;
        private List<ImgBeanHeadline> img;
        private List<List<BodyBeanHeadline>> body;
        private List<NoticeBeanHeadline> notice;

        public CodeVersionBeanHeadline getCodeVersion() {
            return codeVersion;
        }

        public void setCodeVersion(CodeVersionBeanHeadline codeVersion) {
            this.codeVersion = codeVersion;
        }

        public List<ImgBeanHeadline> getImg() {
            return img;
        }

        public void setImg(List<ImgBeanHeadline> img) {
            this.img = img;
        }

        public List<List<BodyBeanHeadline>> getBody() {
            return body;
        }

        public void setBody(List<List<BodyBeanHeadline>> body) {
            this.body = body;
        }

        public List<NoticeBeanHeadline> getNotice() {
            return notice;
        }

        public void setNotice(List<NoticeBeanHeadline> notice) {
            this.notice = notice;
        }

        public static class CodeVersionBeanHeadline {
            /**
             * versionId : 1
             * version : 2.1.1
             */

            private int versionId;
            private String version;

            public int getVersionId() {
                return versionId;
            }

            public void setVersionId(int versionId) {
                this.versionId = versionId;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }

        public static class ImgBeanHeadline {
            /**
             * carouselId : 1
             * carouselUrl : http://202.43.144.61:2062/icmdb-backend/pictureShowController/showPicture?picture=/resources/img/banner_company_hans@3x.png
             */

            private int carouselId;
            private String carouselUrl;

            public int getCarouselId() {
                return carouselId;
            }

            public void setCarouselId(int carouselId) {
                this.carouselId = carouselId;
            }

            public String getCarouselUrl() {
                return carouselUrl;
            }

            public void setCarouselUrl(String carouselUrl) {
                this.carouselUrl = carouselUrl;
            }
        }

        public static class BodyBeanHeadline {

            private int categoryId;
            private int isOptional;
            private int detectionId;
            private String detectionItem;
            private String detectionInfo;
            private String url;
            private int creator;
            private int sorting;
            private String categoryTitle;
            private String urlList;
            private String detailPictureUrl;
            private int isAttestation;
            private int isOpen;
            private int language;

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public int getIsOptional() {
                return isOptional;
            }

            public void setIsOptional(int isOptional) {
                this.isOptional = isOptional;
            }

            public int getDetectionId() {
                return detectionId;
            }

            public void setDetectionId(int detectionId) {
                this.detectionId = detectionId;
            }

            public String getDetectionItem() {
                return detectionItem;
            }

            public void setDetectionItem(String detectionItem) {
                this.detectionItem = detectionItem;
            }

            public String getDetectionInfo() {
                return detectionInfo;
            }

            public void setDetectionInfo(String detectionInfo) {
                this.detectionInfo = detectionInfo;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getCreator() {
                return creator;
            }

            public void setCreator(int creator) {
                this.creator = creator;
            }

            public int getSorting() {
                return sorting;
            }

            public void setSorting(int sorting) {
                this.sorting = sorting;
            }

            public String getCategoryTitle() {
                return categoryTitle;
            }

            public void setCategoryTitle(String categoryTitle) {
                this.categoryTitle = categoryTitle;
            }

            public String getUrlList() {
                return urlList;
            }

            public void setUrlList(String urlList) {
                this.urlList = urlList;
            }

            public String getDetailPictureUrl() {
                return detailPictureUrl;
            }

            public void setDetailPictureUrl(String detailPictureUrl) {
                this.detailPictureUrl = detailPictureUrl;
            }

            public int getIsAttestation() {
                return isAttestation;
            }

            public void setIsAttestation(int isAttestation) {
                this.isAttestation = isAttestation;
            }

            public int getIsOpen() {
                return isOpen;
            }

            public void setIsOpen(int isOpen) {
                this.isOpen = isOpen;
            }

            public int getLanguage() {
                return language;
            }

            public void setLanguage(int language) {
                this.language = language;
            }
        }

        public static class NoticeBeanHeadline {
            private int noticeId;
            private String noticeTitle;
            private String noticeDescription;
            private String picture;
            private String url;
            private int isRelease;
            private int creator;
            private String createDate;
            private int language;

            public int getNoticeId() {
                return noticeId;
            }

            public void setNoticeId(int noticeId) {
                this.noticeId = noticeId;
            }

            public String getNoticeTitle() {
                return noticeTitle;
            }

            public void setNoticeTitle(String noticeTitle) {
                this.noticeTitle = noticeTitle;
            }

            public String getNoticeDescription() {
                return noticeDescription;
            }

            public void setNoticeDescription(String noticeDescription) {
                this.noticeDescription = noticeDescription;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getIsRelease() {
                return isRelease;
            }

            public void setIsRelease(int isRelease) {
                this.isRelease = isRelease;
            }

            public int getCreator() {
                return creator;
            }

            public void setCreator(int creator) {
                this.creator = creator;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public int getLanguage() {
                return language;
            }

            public void setLanguage(int language) {
                this.language = language;
            }
        }
    }
}
