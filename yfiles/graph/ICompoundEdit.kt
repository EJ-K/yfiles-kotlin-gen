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
 * This interface is a means to bracket several [IUndoUnit]s, that is a collection of units that are treated as one (for example they are always undone or redone as a single unit).
 * @see [UndoEngine]
 * @see [IUndoUnit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICompoundEdit">Online Documentation</a>
 */
external interface ICompoundEdit  {
  /**
   * This method cancels the compound editing process.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICompoundEdit%23ICompoundEdit-method-cancel">Online Documentation</a>
   */
  fun cancel()
  
  /**
   * This method commits the compound editing process.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICompoundEdit%23ICompoundEdit-method-commit">Online Documentation</a>
   */
  fun commit()

  
  companion object : InterfaceMetadata<ICompoundEdit> {
  }
}
