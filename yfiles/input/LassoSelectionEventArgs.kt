// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.GeneralPath
import yfiles.lang.ClassMetadata

/**
 * Event arguments used by [LassoSelectionInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionEventArgs">Online Documentation</a>
 */
external class LassoSelectionEventArgs  : InputModeEventArgs {
  /**
   * Gets the current [lasso selection path][LassoSelectionInputMode] of the [LassoSelectionInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionEventArgs%23path">Online Documentation</a>
   */
  final val path: GeneralPath
  
  /**
   * Gets a value determining the [SelectionPolicy] that is currently set by the user.
   * @see [LassoSelectionInputMode.selectionPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionEventArgs%23policy">Online Documentation</a>
   */
  final val policy: SelectionPolicy
  
  companion object : ClassMetadata<LassoSelectionEventArgs> {
  }
}
