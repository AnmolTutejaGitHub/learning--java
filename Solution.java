class Solution {
    public int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        int ptr = 0;

        while(ptr<v1.length && ptr<v2.length) {
            if(Integer.valueOf(v1[ptr])<Integer.valueOf(v2[ptr])) return -1;
            if(Integer.valueOf(v1[ptr])>Integer.valueOf(v2[ptr])) return 1;

            ptr++;
        }

        while(ptr<v1.length && Integer.valueOf(v1[ptr])==0) ptr++;
        while(ptr<v2.length && Integer.valueOf(v2[ptr])==0) ptr++;

        if(ptr<v1.length) return 1;
        if(ptr<v2.length) return -1;

        return 0;
    }
}
