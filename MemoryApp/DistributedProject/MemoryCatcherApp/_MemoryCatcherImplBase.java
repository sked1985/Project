package MemoryCatcherApp;


/**
* MemoryCatcherApp/_MemoryCatcherImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/dropbox/School stuffffff/Barry`s stuff/Year 4/Network programming and distributed systems/Project/Project/DistributedProject/MemoryCatcher.idl
* 29 November 2014 01:21:22 o'clock GMT
*/

public abstract class _MemoryCatcherImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements MemoryCatcherApp.MemoryCatcher, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _MemoryCatcherImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("register", new java.lang.Integer (1));
    _methods.put ("addMemory", new java.lang.Integer (2));
    _methods.put ("removeMemory", new java.lang.Integer (3));
    _methods.put ("buy", new java.lang.Integer (4));
    _methods.put ("getMemory", new java.lang.Integer (5));
    _methods.put ("getResource", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // MemoryCatcherApp/MemoryCatcher/login
       {
         String username = in.read_string ();
         String password = in.read_string ();
         boolean $result = false;
         $result = this.login (username, password);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // MemoryCatcherApp/MemoryCatcher/register
       {
         String username = in.read_string ();
         String password = in.read_string ();
         String email = in.read_string ();
         boolean $result = false;
         $result = this.register (username, password, email);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // MemoryCatcherApp/MemoryCatcher/addMemory
       {
         String memoryName = in.read_string ();
         String memoryDescription = in.read_string ();
         String username = in.read_string ();
         boolean $result = false;
         $result = this.addMemory (memoryName, memoryDescription, username);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // MemoryCatcherApp/MemoryCatcher/removeMemory
       {
         String memoryName = in.read_string ();
         boolean $result = false;
         $result = this.removeMemory (memoryName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // MemoryCatcherApp/MemoryCatcher/buy
       {
         int amount = in.read_long ();
         this.buy (amount);
         out = $rh.createReply();
         break;
       }

       case 5:  // MemoryCatcherApp/MemoryCatcher/getMemory
       {
         String memoryName = in.read_string ();
         String memoryContext = in.read_string ();
         String $result = null;
         $result = this.getMemory (memoryName, memoryContext);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // MemoryCatcherApp/MemoryCatcher/getResource
       {
         int $result = (int)0;
         $result = this.getResource ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MemoryCatcherApp/MemoryCatcher:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _MemoryCatcherImplBase