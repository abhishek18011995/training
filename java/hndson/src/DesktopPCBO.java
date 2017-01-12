import java.util.List;

/* FILL MISSING CODE */
class DesktopPCBO
{
public void printAllDesktopPCDetails(List<DesktopPC> list)
{
System.out.println("Model      Ram Size   HD Capacity     Processor Type       Frequency");
for (DesktopPC desktopPC : list) {
System.out.println(desktopPC);
}

}
public void printDesktopPCDetailsWithProcessorType (List<DesktopPC> list, String processortype)
{
int i=0;
System.out.println("Model      Ram Size   HD Capacity     Processor Type       Frequency");
for (DesktopPC desktopPC : list) {
i=1;
if(desktopPC.getProcessor().getType().equals(processortype))
System.out.println(desktopPC);
 
}
if(i==0)
System.out.println("No records found");
}
public void printDesktopPCDetailsWithProcessorFrequency (List<DesktopPC> list, double processorfrequency)
{
int i=0;
System.out.println("Model      Ram Size   HD Capacity     Processor Type       Frequency");
for (DesktopPC desktopPC : list) {
i=1;
if(desktopPC.getProcessor().getFrequency()==(processorfrequency))
System.out.println(desktopPC);
 
}


if(i==0)
System.out.println("No records found");
}
}
