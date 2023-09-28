public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0) return -1;
        if(height <= 0) return -1;
        if(areaPerBucket <= 0) return -1;
        if(extraBuckets < 0) return -1;

        double area = width * height;
        double totalBuckets = Math.ceil(area / areaPerBucket) - extraBuckets;
        return (int)totalBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0) return -1;
        if(areaPerBucket <= 0) return -1;
        return (int)Math.ceil(area / areaPerBucket);
    }


}
