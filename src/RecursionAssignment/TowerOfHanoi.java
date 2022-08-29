/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionAssignment;

/**
 *
 * @author Lenovo
 */
public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
	if(disks==0){
            return;
        }
         towerOfHanoi(disks-1,source,destination,auxiliary);
         System.out.println(source+" "+destination);
         towerOfHanoi(disks-1,auxiliary,source,destination);
         
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
