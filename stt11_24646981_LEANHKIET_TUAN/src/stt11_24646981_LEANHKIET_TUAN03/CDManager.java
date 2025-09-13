package stt11_24646981_LEANHKIET_TUAN03;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
public class CDManager {
    private static int size = 0;
    private CompactDisc[] cdList;
    public CDManager() {
        this(10); 
    }
    public CDManager(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.cdList = new CompactDisc[capacity];
    }
    
    public CompactDisc add(CompactDisc cd) {
        if (cd == null) {
            throw new IllegalArgumentException("CD không được null");
        }

        // Kiểm tra trùng code
        for (int i = 0; i < size; i++) {
            if (cdList[i].getCode() == cd.getCode()) {
                return null; // Trùng, không thêm
            }
        }

        // Nếu mảng đầy thì mở rộng (1.5 lần)
        if (size == cdList.length) {
            cdList = Arrays.copyOf(cdList, (int)(cdList.length * 1.5));
        }

        // Thêm CD vào cuối mảng
        cdList[size++] = cd;

        return cd;
    }
	public static int getSize() {
		return size;
	}
	public CompactDisc[] getCdList() {
		return Arrays.copyOf(cdList , size) ; 
	}
	public double totalPrice() { 
//		double sum =  0 ; 
//		for(int i =0 ; i  < size ; i++)  { 
//			sum += cdList[i].getPrice() ; 
//		}
//		
//		return sum ; 
		return Arrays.asList(Arrays.copyOf(cdList, size))
				.stream()
				.mapToDouble(CompactDisc::getPrice)
				.sum() ;
	}
    
	public CompactDisc[] sortByPriceInDescending() { 
		CompactDisc[] a= Arrays.copyOf(cdList, size) ; 
		Arrays.sort(a,(x,y) -> Double.compare(x.getPrice(), y.getPrice()));;
		return a ; 
	}
    
    
}


