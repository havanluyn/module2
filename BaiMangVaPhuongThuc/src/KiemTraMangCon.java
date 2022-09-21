public class KiemTraMangCon {
    public int kiemTra(int[] arr, int[] arr1) {
        int kq = 0;
        if (arr1.length <= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr1[0]) {
                    int j = 0;
                    for (; j < arr1.length; j++) {
                        if (arr[i + j] != arr1[j])
                            break;
                    }
                    if (j == arr1.length)
                        kq = 1;
                }
            }
        } else {
            return -1;
        }
        return kq;
    }
}
