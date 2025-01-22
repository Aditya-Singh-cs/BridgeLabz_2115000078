class VolumeOfEarth{
	public static void main(String args[]){
		double radiusInKm=6378;
		double radiusInMiles=(radiusInKm/1.6),pi=3.14;
		double volumeInKm=((4.0/3.0)*pi*(radiusInKm*radiusInKm*radiusInKm));
		double volumeInMiles=((4.0/3.0)*pi*(radiusInMiles*radiusInMiles*radiusInMiles));
		System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
	}
}
