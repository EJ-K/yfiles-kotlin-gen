// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.lang.InterfaceMetadata

/**
 * A simple interface that can be used to react to clicks on regions of [INodeStyle][yfiles.styles.INodeStyle]s etc.
 * @see [GraphEditorInputMode]
 * @see [CollapsibleNodeStyleDecorator][yfiles.styles.CollapsibleNodeStyleDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClickListener">Online Documentation</a>
 */
external interface IClickListener  {
  /**
   * Gets an [IHitTestable] that can be used to check if [onClicked][IClickListener] should be invoked.
   * @return A hit testable that can determine whether [onClicked][IClickListener] should be invoked by a given click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClickListener%23IClickListener-method-getHitTestable">Online Documentation</a>
   */
  fun getHitTestable(): IHitTestable
  
  /**
   * Called by the framework to indicate that the [IModelItem][yfiles.graph.IModelItem] has been clicked by the user at the specified location.
   * @param [context] The context to use for the click operation.
   * @param [location] The location of the click
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClickListener%23IClickListener-method-onClicked">Online Documentation</a>
   */
  fun onClicked(
    context: IInputModeContext,
    location: Point,
  )

  
  companion object : InterfaceMetadata<IClickListener> {
  }
}
