



    class fat_rate_factory{
        public body_fat_rate getRate(double rate){
            if(rate >= 100||rate <= 0){
                return null;
            }
            if(rate>=18){
                return new too_fat();
            } else if(rate<=13){
                return new tooThin();
            } else {
                return new normal_rate();
            }
        }



}





