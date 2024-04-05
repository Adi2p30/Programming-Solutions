package Array1;

public class make2 {

  public int[] make2(int[] a, int[] b) {
    int[] nums1 = new int[2];
    if (a.length == 1) {
      nums1[0] = a[0];
      nums1[1] = b[0];
    } else if (a.length >= 2) {
      nums1[0] = a[0];
      nums1[1] = a[1];
    } else if (a.length == 0) {
      nums1[0] = b[0];
      nums1[1] = b[1];
    }
    return nums1;
  }
}
