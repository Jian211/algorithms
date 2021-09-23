package util;

import struct.Student;

public class ArrayUtil {
    // 1. int[]
    // 1-A. 파라미터로 받은 배열 길이의 값을 출력하는 메소드.
    public static int size(int[] arr) {
        return arr.length;
    }

    // 1-B. 파라미터로 받은 배열 길이의 값이 없으면 true; 
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    // 1-C. �쁽�옱 諛곗뿴�뿉�꽌 �뙆�씪誘명꽣濡� �뱾�뼱�삩 int 媛믪씠 議댁옱�븯�뒗吏� �솗�씤�븯�뒗
    // contains()
    public static boolean contains(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (arr[i] == e) {
                return true;
            }
        }

        return false;
    }

    // 1-D. �쁽�옱 諛곗뿴�뿉�꽌 �뙆�씪誘명꽣濡� �뱾�뼱�삩 int 媛믪씠 紐뉖쾲吏� �씤�뜳�뒪�뿉 �엳�뒗吏�
    // 李얠븘�꽌 由ы꽩�븯�뒗 indexOf()
    // 留뚯빟 �빐�떦 int 媛믪씠 諛곗뿴 �븞�뿉 �뾾�쑝硫�,
    // 媛��옣 媛꾨떒�븯寃� 遺덇��뒫�븳 �씤�뜳�뒪瑜� �몴�떆�븷 �닔 �엳�뒗
    // -1�씠 由ы꽩�맂�떎.
    // 留뚯빟 �빐�떦 int 媛믪씠 諛곗뿴�뿉 �뿬�윭踰� ���옣�릺�뼱�엳�쓣 寃쎌슦
    // 媛��옣 癒쇱� �벑�옣�븯�뒗 �씤�뜲�뒪媛� 由ы꽩�맂�떎.
    public static int indexOf(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (arr[i] == e) {
                return i;
            }
        }

        return -1;
    }

    // 1-E. �쁽�옱 諛곗뿴�뿉�꽌 �뙆�씪誘명꽣濡� �뱾�뼱�삩 int 媛믪쓽 媛��옣 留덉�留� �씤�뜳�뒪瑜�
    // 由ы꽩�븯�뒗 lastIndexOf().
    // 留뚯빟 �빐�떦 int 媛믪씠 諛곗뿴 �븞�뿉 �뾾�쑝硫�
    // -1�씠 由ы꽩�맂�떎.
    public static int lastIndexOf(int[] arr, int e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (arr[i] == e) {
                return i;
            }
        }

        return -1;
    }

    // 1-F. �쁽�옱 諛곗뿴�뿉�꽌 �뙆�씪誘명꽣濡� �뱾�뼱�삩 �씤�뜳�뒪�뿉 �엳�뒗 媛믪쓣 由ы꽩�븯�뒗
    // get().
    public static int get(int[] arr, int index) {
        return arr[index];
    }

    // 1-G. �쁽�옱 諛곗뿴�뿉 媛��옣 留� �걹�뿉 �뙆�씪誘명꽣濡� �뱾�뼱�삩 媛믪쓣 異붽��븯�뒗
    // add()
    public static int[] add(int[] arr, int e) {
        // 1. arr蹂대떎 �겕湲곌� 1 �뒛�뼱�궃 int[] temp瑜� 留뚮뱺�떎.
        int[] temp = new int[size(arr) + 1];

        // 2. arr�쓽 �궡�슜�쓣 temp�뿉 蹂듭궗�븳�떎.
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }

        // 3. temp�쓽 媛��옣 留덉�留� �씤�뜳�뒪�뿉 e瑜� ���옣�븳�떎.
        temp[size(arr)] = e;

        // 4. �깉濡쒖슫 �슂�냼媛� 異붽��맂 temp瑜� 由ы꽩�븳�떎.
        return temp;
    }

    // 1-H. �쁽�옱 諛곗뿴�뿉 �듅�젙 �씤�뜳�뒪�뿉 �뙆�씪誘명꽣濡� �뱾�뼱�삩 媛믪쓣 異붽��븯�뒗
    // add().
    public static int[] add(int[] arr, int index, int e) {
        // 1. int[] temp瑜� 留뚮뱺�떎.
        int[] temp = new int[0];

        // 2. 0~index-1源뚯��쓽 arr�쓽 �궡�슜�쓣
        // temp�뿉 異붽��븳�떎.
        for (int i = 0; i < index; i++) {
            temp = add(temp, get(arr, i));
        }

        // 3. e瑜� 異붽��븳�떎.
        temp = add(temp, e);

        // 4. index遺��꽣 �걹源뚯��쓽 arr�쓽 �궡�슜�쓣
        // temp�뿉 異붽��븳�떎.
        for (int i = index; i < size(arr); i++) {
            temp = add(temp, get(arr, i));
        }

        // 5. �옉�뾽�씠 �셿猷뚮맂 temp瑜� 由ы꽩�븳�떎.
        return temp;
    }

    // 1-I. �쁽�옱 諛곗뿴�뿉 �듅�젙 �씤�뜳�뒪�쓽 媛믪쓣 �뙆�씪誘명꽣濡� �뱾�뼱�삩 媛믪쑝濡� 援먯껜�븯怨�
    // �썝�옒 �엳�뜕 媛믪쓣 由ы꽩�빐二쇰뒗
    // set().
    public static int set(int[] arr, int index, int e) {
        int temp = get(arr, index);

        arr[index] = e;

        return temp;
    }

    // 1-J. �쁽�옱 諛곗뿴�뿉 �듅�젙 �씤�뜳�뒪�쓽 媛믪쓣 �궘�젣�븯�뒗
    // removeByIndex().
    public static int[] removeByIndex(int[] arr, int index) {
        // 1. 留뚯빟 �궗�슜�옄媛� �옒紐삳맂 index瑜� �꽔�뿀�쓣 寃쎌슦
        // �썝蹂몄씤 arr�쓣 洹몃�濡� 由ы꽩�븳�떎.
        if (!(index >= 0 && index < size(arr))) {
            return arr;
        }
//        �뼱�젮�슫 踰꾩졏
//        // 2. int[] temp瑜� 留뚮뱾�뼱�꽌 arr�쓽 �쁽�옱 �궡�슜�쓣 蹂듭궗�븳�떎.
//        int[] temp = new int[size(arr)];
//        for (int i = 0; i < size(arr); i++) {
//            temp[i] = get(arr, i);
//        }
//
//        // 3. arr�쓣 �겕湲곕�� 1 以꾩씤�떎.
//        arr = new int[size(temp) - 1];
//
//        // 4. 0遺��꽣 index-1源뚯��쓽 temp�쓽 媛믪쓣 arr�뿉 ���옣�븳�떎.
//        for (int i = 0; i < index; i++) {
//            arr[i] = get(temp, i);
//        }
//
//        // 5. index+1遺��꽣 �걹源뚯��쓽 temp�쓽 媛믪쓣 arr�뿉 ���옣�븳�떎.
//        for (int i = index + 1; i < size(temp); i++) {
//            arr[i - 1] = get(temp, i);
//        }
//
//        // 6. arr�쓣 由ы꽩�븳�떎.
//        return arr;
        // �돩�슫 踰꾩졏
        // 1. 蹂�寃쎈맂 �궡�슜�쓣 �떞�쓣 int[] temp
        int[] temp = new int[0];
        // 2. for臾몄쓣 �궗�슜�븯�뿬 i媛� �씤�뜳�뒪媛� �븘�땶 寃쎌슦
        // temp�뿉 arr�쓽 i踰� �궡�슜�쓣 異붽��븳�떎.
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));
            }
        }

        // 3. temp瑜� 由ы꽩�븳�떎.
        return temp;
    }

    // 1-K. �쁽�옱 諛곗뿴�뿉�꽌 �뙆�씪誘명꽣濡� �뱾�뼱�삩 int 媛믪쓣 李얠븘�꽌 �궘�젣�븯�뒗
    // removeByElement()
    public static int[] removeByElement(int[] arr, int e) {
        return removeByIndex(arr, indexOf(arr, e));
    }

    // 1-L. �쁽�옱 諛곗뿴�쓣 �삤由꾩감�닚 �젙�젹�븯�뒗
    // sort()
    public static void sort(int[] arr) {
        for (int i = 0; i < size(arr) - 1; i++) {
            if (get(arr, i) > get(arr, i + 1)) {
                arr[i + 1] = set(arr, i, get(arr, i + 1));
                i = -1;
            }
        }
    }

    // 2. String[]
    // A. size()
    public static int size(String[] arr) {
        return arr.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(String[] arr) {
        return size(arr) == 0;
    }

    // C. contains()
    public static boolean contains(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {
                return true;
            }
        }

        return false;
    }

    // D. indexOf()
    public static int indexOf(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }

        return -1;
    }

    // E. lastIndexOf()
    public static int lastIndexOf(String[] arr, String e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }

        return -1;
    }

    // F. get()
    public static String get(String[] arr, int index) {
        return arr[index];
    }

    // G. add()
    public static String[] add(String[] arr, String e) {
        String[] temp = new String[size(arr) + 1];

        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }

        temp[size(arr)] = e;

        return temp;
    }

    // H. add(index)
    public static String[] add(String[] arr, int index, String e) {
        String[] temp = new String[0];

        for (int i = 0; i < index; i++) {
            temp = add(temp, get(arr, i));
        }

        temp = add(temp, e);

        for (int i = index; i < size(arr); i++) {
            temp = add(temp, get(arr, i));
        }

        return temp;
    }

    // I. set()
    public static String set(String[] arr, int index, String e) {
        String temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // J. remove(int index)
    public static String[] remove(String[] arr, int index) {
        String[] temp = new String[0];

        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));
            }
        }

        return temp;
    }

    // K. remove(String e)
    public static String[] remove(String[] arr, String e) {
        return remove(arr, indexOf(arr, e));
    }

    // 3. Student[]
    // A. size()
    public static int size(Student[] arr) {
        return arr.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(Student[] arr) {
        return size(arr) == 0;
    }

    // C. contains()
    public static boolean contains(Student[] arr, Student s) {
        for (int i = 0; i < arr.length; i++) {
            if (get(arr, i).id == s.id) {
                return true;
            }
        }

        return false;
    }

    // D. indexOf()
    public static int indexOf(Student[] arr, Student s) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).id == s.id) {
                return i;
            }
        }

        return -1;
    }

    // E. lastIndexOf()
    public static int lastIndexOf(Student[] arr, Student s) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).id == s.id) {
                return i;
            }
        }

        return -1;
    }

    // F. get()
    public static Student get(Student[] arr, int index) {
        return arr[index];
    }

    // G. add()
    public static Student[] add(Student[] arr, Student s) {
        Student[] temp = new Student[size(arr) + 1];

        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }

        temp[size(temp) - 1] = s;

        return temp;
    }

    // H. add(index)
    public static Student[] add(Student[] arr, int index, Student s) {
        Student[] temp = new Student[0];

        for (int i = 0; i < size(arr);) {
            if (i != index) {
                temp = add(temp, get(arr, i));
                i++;
            } else {
                temp = add(temp, s);
            }
        }

        return temp;
    }

    // I. set()
    public static Student set(Student[] arr, int index, Student s) {
        Student temp = get(arr, index);
        arr[index] = s;

        return temp;
    }

    // J. remove(index)
    public static Student[] remove(Student[] arr, int index) {
        Student[] temp = new Student[0];

        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));
            }
        }

        return temp;
    }

    // K. remove()
    public static Student[] remove(Student[] arr, Student s) {
        return remove(arr, indexOf(arr, s));
    }

    // 4. classEx.Student[]
    // A. size()
    public static int size(classEx.Student[] arr) {
        return arr.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(classEx.Student[] arr) {
        return size(arr) == 0;
    }

    // C. contains()
    public static boolean contains(classEx.Student[] arr, classEx.Student s) {
        for (int i = 0; i < arr.length; i++) {
            if (get(arr, i).equals(s)) {
                return true;
            }
        }

        return false;
    }

    // D. indexOf()
    public static int indexOf(classEx.Student[] arr, classEx.Student s) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(s)) {
                return i;
            }
        }

        return -1;
    }

    // E. lastIndexOf()
    public static int lastIndexOf(classEx.Student[] arr, classEx.Student s) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).equals(s)) {
                return i;
            }
        }

        return -1;
    }

    // F. get()
    public static classEx.Student get(classEx.Student[] arr, int index) {
        return arr[index];
    }

    // G. add()
    public static classEx.Student[] add(classEx.Student[] arr, classEx.Student s) {
        classEx.Student[] temp = new classEx.Student[size(arr) + 1];

        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }

        temp[size(temp) - 1] = s;

        return temp;
    }

    // H. add(index)
    public static classEx.Student[] add(classEx.Student[] arr, int index, classEx.Student s) {
        classEx.Student[] temp = new classEx.Student[0];

        for (int i = 0; i < size(arr);) {
            if (i != index) {
                temp = add(temp, get(arr, i));
                i++;
            } else {
                temp = add(temp, s);
            }
        }

        return temp;
    }

    // I. set()
    public static classEx.Student set(classEx.Student[] arr, int index, classEx.Student s) {
        classEx.Student temp = get(arr, index);
        arr[index] = s;

        return temp;
    }

    // J. remove(index)
    public static classEx.Student[] remove(classEx.Student[] arr, int index) {
        classEx.Student[] temp = new classEx.Student[0];

        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));
            }
        }

        return temp;
    }

    // K. remove()
    public static classEx.Student[] remove(classEx.Student[] arr, classEx.Student s) {
        return remove(arr, indexOf(arr, s));
    }
}
