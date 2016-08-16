package com.example.wang.retrofitwithrxjava.bean;

import java.util.List;

/**
 * Created by wang on 2016/8/15 0015.
 */
public class ResponseBen {

    /**
     * alt : https://movie.douban.com/subject/3541415/
     * casts : [{"alt":"https://movie.douban.com/celebrity/1041029/","avatars":{"large":"https://img3.doubanio.com/img/celebrity/large/470.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/470.jpg","small":"https://img3.doubanio.com/img/celebrity/small/470.jpg"},"id":"1041029","name":"莱昂纳多·迪卡普里奥"},{"alt":"https://movie.douban.com/celebrity/1101703/","avatars":{"large":"https://img1.doubanio.com/img/celebrity/large/3517.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/3517.jpg","small":"https://img1.doubanio.com/img/celebrity/small/3517.jpg"},"id":"1101703","name":"约瑟夫·高登-莱维特"},{"alt":"https://movie.douban.com/celebrity/1012520/","avatars":{"large":"https://img1.doubanio.com/img/celebrity/large/118.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/118.jpg","small":"https://img1.doubanio.com/img/celebrity/small/118.jpg"},"id":"1012520","name":"艾伦·佩吉"}]
     * collect_count : 844201
     * directors : [{"alt":"https://movie.douban.com/celebrity/1054524/","avatars":{"large":"https://img3.doubanio.com/img/celebrity/large/673.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/673.jpg","small":"https://img3.doubanio.com/img/celebrity/small/673.jpg"},"id":"1054524","name":"克里斯托弗·诺兰"}]
     * genres : ["剧情","动作","科幻"]
     * id : 3541415
     * images : {"large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p513344864.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p513344864.jpg","small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p513344864.jpg"}
     * original_title : Inception
     * rating : {"average":9.2,"max":10,"min":0,"stars":"50"}
     * subtype : movie
     * title : 盗梦空间
     * year : 2010
     */

    private String alt;
    private int collect_count;
    private String id;
    /**
     * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p513344864.jpg
     * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p513344864.jpg
     * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p513344864.jpg
     */

    private ImagesBean images;
    private String original_title;
    /**
     * average : 9.2
     * max : 10
     * min : 0
     * stars : 50
     */

    private RatingBean rating;
    private String subtype;
    private String title;
    private String year;
    /**
     * alt : https://movie.douban.com/celebrity/1041029/
     * avatars : {"large":"https://img3.doubanio.com/img/celebrity/large/470.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/470.jpg","small":"https://img3.doubanio.com/img/celebrity/small/470.jpg"}
     * id : 1041029
     * name : 莱昂纳多·迪卡普里奥
     */

    private List<CastsBean> casts;
    /**
     * alt : https://movie.douban.com/celebrity/1054524/
     * avatars : {"large":"https://img3.doubanio.com/img/celebrity/large/673.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/673.jpg","small":"https://img3.doubanio.com/img/celebrity/small/673.jpg"}
     * id : 1054524
     * name : 克里斯托弗·诺兰
     */

    private List<DirectorsBean> directors;
    private List<String> genres;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "ResponseBen{" +
                "alt='" + alt + '\'' +
                ", collect_count=" + collect_count +
                ", id='" + id + '\'' +
                ", images=" + images +
                ", original_title='" + original_title + '\'' +
                ", rating=" + rating +
                ", subtype='" + subtype + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", casts=" + casts +
                ", directors=" + directors +
                ", genres=" + genres +
                '}';
    }

    public static class ImagesBean {
        private String large;
        private String medium;
        private String small;

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }
    }

    public static class RatingBean {
        private double average;
        private int max;
        private int min;
        private String stars;

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }
    }

    public static class CastsBean {
        private String alt;
        /**
         * large : https://img3.doubanio.com/img/celebrity/large/470.jpg
         * medium : https://img3.doubanio.com/img/celebrity/medium/470.jpg
         * small : https://img3.doubanio.com/img/celebrity/small/470.jpg
         */

        private AvatarsBean avatars;
        private String id;
        private String name;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static class AvatarsBean {
            private String large;
            private String medium;
            private String small;

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }
        }
    }

    public static class DirectorsBean {
        private String alt;
        /**
         * large : https://img3.doubanio.com/img/celebrity/large/673.jpg
         * medium : https://img3.doubanio.com/img/celebrity/medium/673.jpg
         * small : https://img3.doubanio.com/img/celebrity/small/673.jpg
         */

        private AvatarsBean avatars;
        private String id;
        private String name;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static class AvatarsBean {
            private String large;
            private String medium;
            private String small;

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }
        }
    }
}
