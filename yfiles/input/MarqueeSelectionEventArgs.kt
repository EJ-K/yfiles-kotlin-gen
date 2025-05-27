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
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata

/**
 * Event arguments used by [MarqueeSelectionInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionEventArgs">Online Documentation</a>
 */
external class MarqueeSelectionEventArgs  : InputModeEventArgs {
  /**
   * Gets the current [selection as a path][MarqueeSelectionInputMode] of the [MarqueeSelectionInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionEventArgs%23path">Online Documentation</a>
   */
  final val path: GeneralPath
  
  /**
   * Gets a value determining the [SelectionPolicy] that is currently set by the user.
   * @see [MarqueeSelectionInputMode.selectionPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionEventArgs%23policy">Online Documentation</a>
   */
  final val policy: SelectionPolicy
  
  /**
   * Gets the current [selectionRectangle][MarqueeSelectionInputMode] of the [MarqueeSelectionInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionEventArgs%23rectangle">Online Documentation</a>
   */
  final val rectangle: Rect
  
  /**
   * Gets a value determining whether [path][MarqueeSelectionEventArgs] takes precedence over [rectangle][MarqueeSelectionEventArgs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionEventArgs%23usePath">Online Documentation</a>
   */
  final val usePath: Boolean
  
  companion object : ClassMetadata<MarqueeSelectionEventArgs> {
  }
}
