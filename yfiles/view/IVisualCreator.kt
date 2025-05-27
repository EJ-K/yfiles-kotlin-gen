// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.InterfaceMetadata

/**
 * Factory interface which is used by implementations that know how to create [Visual]s for rendering into a given [IRenderContext].
 * @see [CanvasComponent]
 * @see [IObjectRenderer]
 * @see [IRenderTreeElement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualCreator">Online Documentation</a>
 */
external interface IVisualCreator  {
  /**
   * This method is called by the framework to create a [Visual] that will be included in the [IRenderContext].
   * @param [context] The context that describes where the visual will be used.
   * @return The visual to include in the render tree. This may be `null`.
   * @see [updateVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualCreator%23IVisualCreator-method-createVisual">Online Documentation</a>
   */
  fun createVisual(
    context: IRenderContext,
  ): Visual?
  
  /**
   * This method updates or replaces a previously created [Visual] for inclusion in the [IRenderContext].
   * @param [context] The context that describes where the visual will be used in.
   * @param [oldVisual] The visual instance to be updated.
   * @return `oldVisual`, if this instance modified the visual, or a new visual that should replace the existing one in the render tree.
   * @see [createVisual]
   * @see [IObjectRenderer]
   * @see [CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualCreator%23IVisualCreator-method-updateVisual">Online Documentation</a>
   */
  fun updateVisual(
    context: IRenderContext,
    oldVisual: Visual?,
  ): Visual?

  
  companion object : InterfaceMetadata<IVisualCreator> {
    /**
     * An immutable and shareable instance of the [IVisualCreator] class that renders nothing.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualCreator%23VOID_VISUAL_CREATOR">Online Documentation</a>
     */
     val VOID_VISUAL_CREATOR: IVisualCreator
  }
}
