// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IPort
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.Visual

/**
 * An abstract base class that makes it possible to easily implement a custom [IPortStyle].
 * @param [TVisual] The optional type of the [Visual] created and updated by the [createVisual][PortStyleBase] and [updateVisual][PortStyleBase] methods. This type argument can be omit, but specifying a more concrete type helps conveniently implementing [updateVisual][PortStyleBase] with TypeScript.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortStyleBase] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-constructor-PortStyleBase">Online Documentation</a>
 */
abstract external class PortStyleBase<TVisual : Visual> protected constructor() : IPortStyle {
  /**
   * Gets the renderer implementation for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23renderer">Online Documentation</a>
   */
  final override val renderer: IPortStyleRenderer
  
  /**
   * Creates a new object that is a copy of the current instance.
   * @return A new object that is a copy of this instance using a memberwise clone.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-clone">Online Documentation</a>
   */
  override fun clone(): PortStyleBase<TVisual>
  
  /**
   * Creates the visual.
   * @param [context] The render context.
   * @param [port] The port to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [updateVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-createVisual">Online Documentation</a>
   */
  protected abstract fun createVisual(
    context: IRenderContext,
    port: IPort,
  ): TVisual?
  
  /**
   * Returns the bounds of the visual for the port in the given context.
   * @param [context] The canvas context.
   * @param [port] The port to which this style instance is assigned.
   * @return The visual bounds of the visual representation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-getBounds">Online Documentation</a>
   */
  protected abstract fun getBounds(
    context: ICanvasContext,
    port: IPort,
  ): Rect
  
  /**
   * Determines whether the visual representation of the port has been hit at the given location.
   * @param [context] The input mode context.
   * @param [location] The point to test.
   * @param [port] The port to which this style instance is assigned.
   * @return `true` if the specified port representation is hit; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-isHit">Online Documentation</a>
   */
  protected open fun isHit(
    context: IInputModeContext,
    location: Point,
    port: IPort,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified port is included in the marquee selection.
   * @param [context] The input mode context.
   * @param [rectangle] The marquee selection box.
   * @param [port] The port to which this style instance is assigned.
   * @return `true` if the specified port is visible and selected by the marquee rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-isInBox">Online Documentation</a>
   */
  protected open fun isInBox(
    context: IInputModeContext,
    rectangle: Rect,
    port: IPort,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified port is included in the lasso selection.
   * @param [context] The input mode context.
   * @param [path] The lasso selection path.
   * @param [port] The port to which this style instance is assigned.
   * @return `true` if the specified port is visible and selected by the lasso path; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-isInPath">Online Documentation</a>
   */
  protected open fun isInPath(
    context: IInputModeContext,
    path: GeneralPath,
    port: IPort,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified port is visible in the context.
   * @param [context] The canvas context.
   * @param [rectangle] The clipping rectangle.
   * @param [port] The port to which this style instance is assigned.
   * @return `true` if the specified port is visible in the clipping rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-isVisible">Online Documentation</a>
   */
  protected open fun isVisible(
    context: ICanvasContext,
    rectangle: Rect,
    port: IPort,
  ): Boolean
  
  /**
   * Performs the [lookup][yfiles.collections.ILookup] operation for the [getContext][IPortStyleRenderer] that has been queried from the [renderer][PortStyleBase].
   * @param [port] The port to use for the context lookup.
   * @param [type] The type to query.
   * @return An implementation of the `type` or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-lookup">Online Documentation</a>
   */
  protected open fun <T : Any> lookup(
    port: IPort,
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Updates the visual previously created by [createVisual][PortStyleBase].
   * @param [context] The render context.
   * @param [oldVisual] The visual that has been created in the call to [createVisual][PortStyleBase].
   * @param [port] The port to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [createVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleBase%23PortStyleBase-method-updateVisual">Online Documentation</a>
   */
  protected open fun updateVisual(
    context: IRenderContext,
    oldVisual: TVisual,
    port: IPort,
  ): TVisual?
  
  companion object : ClassMetadata<PortStyleBase<*>> {
  }
}
