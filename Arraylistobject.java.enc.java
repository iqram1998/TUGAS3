import java.util.ArrayList;


public class Arraylistobject {
	private String kelas,nama,alamat,nim;
	private int mahasiswa;
	
		public Arraylistobject(String nama,String nim,String kelas,String alamat){
			this.nama  = nama;
			this.nim   = nim;
			this.kelas = kelas;
			this.alamat= alamat;
			
		}
		public String getnama(){
			return nama;
		}
		public void setnama(String nama){
			this.nama= nama;
		}
		public String getkelas(){
			return kelas;
		}
		public void setkelas(String kelas){
			this.kelas= kelas;
		}
		public String getalamat(){
			return alamat;
		}
		public void setalamat(String alamat){
			this.alamat= alamat;
		}
		public String getnim(){
			return nim;
		}
		public void setnim(String nim){
			this.nim= nim;
		}
		 public int getmahasiswa() {
				return mahasiswa;
			    }
			    public void setStudentage(int mahasiswa) {
			 	this.mahasiswa = mahasiswa;
			    }	
		 public int compareTo(arraylistobject comparestu) {
		        int compareage=((arraylistobject)comparestu).getmahasiswa();
		        return this.mahasiswa-compareage;

		        
		    }
		 public String toString () {
	         return "[nama =" + nama + ", nim =" + nim + ", kelas =" + kelas + "]";
	 }
		 public static void main(String[] args) {
		ArrayList<arraylistobject>isi=new ArrayList<arraylistobject>();
		isi.add(new arraylistobject("indra","20217399","informatika d","sembarang"));
		isi.add(new arraylistobject("budi","123666666","informatika d","sembarang"));
		isi.add(new arraylistobject("arman","23457777","informatika d","sembarang"));
		   for(arraylistobject str: isi){
				System.out.println(str);

	}}

}
