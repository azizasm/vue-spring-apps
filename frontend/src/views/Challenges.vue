<template>
    <div>

        <div class="position-relative">
            <!-- shape Hero -->

            <!-- 1st Hero Variation -->
        </div>
        <section class="section section section-shaped my-0 overflow-hidden">
            <div class="shape shape-style-1 bg-gradient-warning shape-skew">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                <span></span>
            </div>
            <div class="container py-0">
                <div class="row row-grid align-items-center">
                    <div class="col-md-6 order-lg-2 ml-lg-auto">
                        <!--<div class="position-relative pl-md-5">-->
                            <!--<img src="img/ill/ill-2.svg" class="img-center img-fluid">-->
                        <!--</div>-->
                    </div>
                    <div class="col-lg-6 order-lg-1">
        <!--                <div class="d-flex px-3">
                            <div>
                                <icon name="ni ni-building" size="lg" class="bg-gradient-white" color="primary" shadow
                                      rounded></icon>
                            </div>
                            <div class="pl-4">
                                <h4 class="display-3 text-white">Modern Interface</h4>
                                <p class="text-white">The Arctic Ocean freezes every winter and much of the sea-ice then
                                    thaws every summer, and that process will continue whatever happens.</p>
                            </div>
                        </div>-->
                        <!--<card shadow class="shadow-lg&#45;&#45;hover mt-5">
                            <div class="d-flex px-3">
                                <div>
                                    <icon name="ni ni-satisfied" gradient="success" color="white" shadow
                                          rounded></icon>
                                </div>
                                <div class="pl-4">
                                    <h5 class="title text-success">Awesome Support</h5>
                                    <p>The Arctic Ocean freezes every winter and much of the sea-ice then thaws
                                        every summer, and that process will continue whatever happens.</p>
                                    <a href="#" class="text-success">Learn more</a>
                                </div>
                            </div>
                        </card>
                        <card shadow class="shadow-lg&#45;&#45;hover mt-5">
                            <div class="d-flex px-3">
                                <div>
                                    <icon name="ni ni-active-40" gradient="warning" color="white" shadow
                                          rounded></icon>
                                </div>
                                <div class="pl-4">
                                    <h5 class="title text-warning">Modular Components</h5>
                                    <p>The Arctic Ocean freezes every winter and much of the sea-ice then thaws
                                        every summer, and that process will continue whatever happens.</p>
                                    <a href="#" class="text-warning">Learn more</a>
                                </div>
                            </div>
                        </card>-->
                    </div>
                </div>
            </div>
        </section>


        <section class="section section section-shaped my-0 overflow-hidden">
            <!--<custom-controls></custom-controls>-->
            <search></search>
        </section>

    </div>
</template>

<script>

    import CustomControls from "./components/CustomControls";
    import Search from "./components/Search.vue";

    export default {
        name: "components",
        components: {
            CustomControls, Search
        }
    };
</script>
