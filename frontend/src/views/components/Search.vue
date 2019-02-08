<template>



    <section class="section">
        <div class="container">
            <!-- Custom controls -->



            <div class="row row-grid align-items-center">
                <div class="col-md-9">
                    <card gradient="secondary" shadow body-classes="p-lg-5">
                        <h4 class="mb-1">Search</h4>
                        <base-input type="text" class="mt-5"
                                    alternative
                                    v-model="search"
                                    placeholder="Search for a challange"
                                    addon-left-icon="ni ni-user-run">
                        </base-input>
                    </card>
                </div>

                <div class="col-md-9" v-for="challenge in filteredList">
                    <div class="card bg-default shadow border-0">
                        <img v-bind:src="challenge.img" class="card-img-top">
                        <blockquote class="card-blockquote">
                            <h4 class="display-3 font-weight-bold text-white">{{ challenge.author }}</h4>
                            <p class="lead text-italic text-white">{{ challenge.level }} | {{ challenge.cal }} | {{challenge.points}} </p>

                        </blockquote>
                    </div>
                </div>

            </div>


        </div>
    </section>
</template>
<script>
    import BaseNav from "@/components/BaseNav";
    import CloseButton from "@/components/CloseButton";


    class Post {
        constructor(title, link, author, img, level, cal, points ) {
            this.title = title;
            this.link = link;
            this.author = author;
            this.img = img;
            this.level = level;
            this.cal = cal;
            this.points = points;
        }
    }

    export default {
        components: {
            BaseNav,
            CloseButton
        },
        computed: {
            filteredList() {
                return this.postList.filter(post => {
                    return post.title.toLowerCase().includes(this.search.toLowerCase())
                })
            }
        },
        data() {
            return {
                search: '',
                postList: [
                    new Post(
                        'Cardio 500 Calories Run ',
                        'https://vuejs.org/',
                        '500 Calories Run',
                        'img/theme/card-01.png',
                        'Intermediate',
                        '500 Calories',
                        '+100 Points',
                    ),
                    new Post(
                        'Cardio 2.4KM Run ',
                        'https://vuejs.org/',
                        '2.4KM Run',
                        'img/theme/card-02.png',
                        'Intermediate',
                        '640 Calories',
                        '+100 Points',
                    ),
                    new Post(
                        'Cardio 2.5KM Run ',
                        'https://vuejs.org/',
                        '2.5KM Run',
                        'img/theme/card-01.png',
                        'Intermediate',
                        '640 Calories',
                        '+100 Points',
                    ),
                    new Post(
                        'Cardio 2.6KM Run ',
                        'https://vuejs.org/',
                        '2.6KM Run',
                        'img/theme/card-02.png',
                        'Intermediate',
                        '640 Calories',
                        '+100 Points',
                    ),


                ]
            };
        }
    };
</script>
<style>
</style>
