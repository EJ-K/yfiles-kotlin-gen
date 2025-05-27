// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata

/**
 * Represents a unit of work that can be undone and redone.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit">Online Documentation</a>
 */
external interface IUndoUnit  {
  /**
   * Gets the name of the redo unit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23redoName">Online Documentation</a>
   */
  val redoName: String
  
  /**
   * Gets the name of the undo unit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23undoName">Online Documentation</a>
   */
  val undoName: String
  
  /**
   * Called by the [UndoEngine] and client code to let the unit dispose of references aren't needed anymore.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-dispose">Online Documentation</a>
   */
  fun dispose()
  
  /**
   * Redoes the work that is represented by this unit.
   * @see [redoName]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-redo">Online Documentation</a>
   */
  fun redo()
  
  /**
   * Tries to merge the given unit with this one.
   * @param [unit] The unit to incorporate that happened after this unit.
   * @return Whether the state change of `unit` has been incorporated into this unit and `unit` can be disposed of.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-tryMergeUnit">Online Documentation</a>
   */
  fun tryMergeUnit(
    unit: IUndoUnit,
  ): Boolean
  
  /**
   * Tries to replace the given unit with this one.
   * @param [unit] The unit to incorporate that happened before this unit.
   * @return Whether the state change of `this` unit has been incorporated into the given `unit` and `this` can be disposed of.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-tryReplaceUnit">Online Documentation</a>
   */
  fun tryReplaceUnit(
    unit: IUndoUnit,
  ): Boolean
  
  /**
   * Undoes the work that is represented by this unit.
   * @see [undoName]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-method-undo">Online Documentation</a>
   */
  fun undo()

  
  companion object : InterfaceMetadata<IUndoUnit> {
    /**
     * Creates a composite undo unit from several distinct [IUndoUnit] instances.
     * @param [units] The units to combine.
     * @return A composite undo unit that encapsulates the provided undo units.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-defaultmethod-combine(IUndoUnit[])">Online Documentation</a>
     */
    @JsName("combine")
    operator fun invoke(
      vararg units: IUndoUnit,
    ): IUndoUnit
    
    /**
     * Creates a composite undo unit from several distinct [IUndoUnit] instances.
     * @param [undoName] The name for the undo.
     * @param [redoName] The name for the redo.
     * @param [units] The units to combine.
     * @return The combined undo unit
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-defaultmethod-combine(string,string,IUndoUnit[])">Online Documentation</a>
     */
    @JsName("combine")
    operator fun invoke(
      undoName: String?,
      redoName: String?,
      vararg units: IUndoUnit,
    ): IUndoUnit
    
    /**
     * Creates a new undo unit using the provided name and undo and redo handler delegates.
     * @param [undoName] The name of the undo.
     * @param [undo] The undo handler delegate.
     * @param [redo] The redo handler delegate.
     * @return A new undo unit with the provided name and undo and redo handler delegates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-defaultmethod-fromHandler(string,DoHandlerDelegate,DoHandlerDelegate)">Online Documentation</a>
     */
    fun <T> fromHandler(
      undoName: String,
      undo: DoHandlerDelegate<T>,
      redo: DoHandlerDelegate<T>,
    ): IUndoUnit
    
    /**
     * Creates a new undo unit using the provided name and an undo/redo handler delegate as well as the parameters to pass to the delegate.
     * @param [undoName] The name of the undo.
     * @param [undoRedo] The undo and redo handler delegate.
     * @param [undoParam] The undo parameter to pass to the delegate.
     * @param [redoParam] The redo parameter to pass to the delegate.
     * @return An undo unit composed of the specified undo and redo handler.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-defaultmethod-fromHandler(string,DoHandlerDelegate,T,T)">Online Documentation</a>
     */
    fun <T> fromHandler(
      undoName: String,
      undoRedo: DoHandlerDelegate<T>,
      undoParam: T?,
      redoParam: T?,
    ): IUndoUnit
    
    /**
     * Creates a new undo unit using the provided name and undo and redo handler delegates as well as the parameters to pass to the delegates.
     * @param [undoName] The name of the undo.
     * @param [undo] The undo handler delegate.
     * @param [redo] The redo handler delegate.
     * @param [undoParam] The undo parameter to pass to the delegate.
     * @param [redoParam] The redo parameter to pass to the delegate.
     * @return An undo unit composed of the specified undo and redo handlers.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IUndoUnit%23IUndoUnit-defaultmethod-fromHandler(string,DoHandlerDelegate,DoHandlerDelegate,T,T)">Online Documentation</a>
     */
    fun <T> fromHandler(
      undoName: String,
      undo: DoHandlerDelegate<T>,
      redo: DoHandlerDelegate<T>,
      undoParam: T?,
      redoParam: T?,
    ): IUndoUnit
  }
}
