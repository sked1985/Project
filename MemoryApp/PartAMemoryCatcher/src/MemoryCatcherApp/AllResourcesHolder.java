package MemoryCatcherApp;


/**
* MemoryCatcherApp/AllResourcesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Project/MemoryApp/PartAMemoryCatcher/src/partamemorycatcher/MemoryCatcher.idl
* 04 December 2014 23:09:19 o'clock GMT
*/

public final class AllResourcesHolder implements org.omg.CORBA.portable.Streamable
{
  public MemoryCatcherApp.Resources value[] = null;

  public AllResourcesHolder ()
  {
  }

  public AllResourcesHolder (MemoryCatcherApp.Resources[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MemoryCatcherApp.AllResourcesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MemoryCatcherApp.AllResourcesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MemoryCatcherApp.AllResourcesHelper.type ();
  }

}
