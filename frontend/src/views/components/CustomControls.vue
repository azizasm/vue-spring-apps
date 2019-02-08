<template>
    <section class="section">
        <div class="container">
            <!-- Custom controls -->
            <div class="row">

                <div class="col-lg-3 col-sm-6 mt-4 mt-md-0">
                    <div class="mb-3">
                        <small class="text-uppercase font-weight-bold">Sliders</small>
                    </div>
                    <!-- Simple slider -->
                    <base-slider v-model="sliders.slider1" >

                    </base-slider>

                </div>
            </div>

        </div>
    </section>
</template>
<script>
import BaseNav from "@/components/BaseNav";
import CloseButton from "@/components/CloseButton";

export default {
  components: {
    BaseNav,
    CloseButton
  },
  data() {
    return {
/*      checkboxes: {
        unchecked: false,
        checked: true,
        uncheckedDisabled: false,
        checkedDisabled: true
      },
      radio: {
        radio1: "radio1",
        radio2: "radio3"
      },
      switches: {
        off: false,
        on: true
      },*/
      sliders: {
        slider1: 0,

      }
    };
  }
};
</script>
<style>
</style>
