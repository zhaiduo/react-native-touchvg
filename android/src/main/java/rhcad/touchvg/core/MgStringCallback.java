/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgStringCallback {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MgStringCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgStringCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgStringCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.MgStringCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgStringCallback_change_ownership(this, swigCPtr, true);
  }

  public void onGetString(String text) {
    touchvgJNI.MgStringCallback_onGetString(swigCPtr, this, text);
  }

  public MgStringCallback() {
    this(touchvgJNI.new_MgStringCallback(), true);
    touchvgJNI.MgStringCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
