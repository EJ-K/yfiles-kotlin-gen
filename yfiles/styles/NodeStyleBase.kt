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
import yfiles.graph.INode
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.Visual

/**
 * An abstract base class that makes it possible to easily implement a custom [INodeStyle].
 * @param [TVisual] The optional type of the [Visual] created and updated by the [createVisual][NodeStyleBase] and [updateVisual][NodeStyleBase] methods. This type argument can be omit, but specifying a more concrete type helps conveniently implementing [updateVisual][NodeStyleBase] with TypeScript.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeStyleBase] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-constructor-NodeStyleBase">Online Documentation</a>
 */
abstract external class NodeStyleBase<TVisual : Visual> protected constructor() : INodeStyle {
  /**
   * Gets the renderer implementation for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Creates a new object that is a copy of the current instance.
   * @return A new object that is a copy of this instance using a memberwise clone.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-clone">Online Documentation</a>
   */
  override fun clone(): NodeStyleBase<TVisual>
  
  /**
   * Creates the visual representation for `node`.
   * @param [context] The render context.
   * @param [node] The node to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [updateVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-createVisual">Online Documentation</a>
   */
  protected abstract fun createVisual(
    context: IRenderContext,
    node: INode,
  ): TVisual?
  
  /**
   * Gets the bounds of the visual for the node in the given context.
   * @param [context] The canvas context.
   * @param [node] The node to which this style instance is assigned.
   * @return The visual bounds of the visual representation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-getBounds">Online Documentation</a>
   */
  protected open fun getBounds(
    context: ICanvasContext,
    node: INode,
  ): Rect
  
  /**
   * Gets the intersection of a line with the visual representation of the node.
   * @param [node] The node to which this style instance is assigned.
   * @param [inner] The coordinates of a point lying [inside][NodeStyleBase] the shape.
   * @param [outer] The coordinates of a point lying outside the shape.
   * @return The intersection point if one has been found or `null`, otherwise.
   * @see [isInside]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-getIntersection">Online Documentation</a>
   */
  protected open fun getIntersection(
    node: INode,
    inner: Point,
    outer: Point,
  ): Point?
  
  /**
   * Gets the outline of the visual style.
   * @param [node] The node to which this style instance is assigned.
   * @return The outline of the visual representation or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-getOutline">Online Documentation</a>
   */
  protected open fun getOutline(
    node: INode,
  ): GeneralPath?
  
  /**
   * Determines whether the visual representation of the node has been hit at the given location.
   * @param [context] The canvas context.
   * @param [location] The point to test.
   * @param [node] The node to which this style instance is assigned.
   * @return `true` if the specified node representation is hit; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-isHit">Online Documentation</a>
   */
  protected open fun isHit(
    context: IInputModeContext,
    location: Point,
    node: INode,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified node is included in the marquee selection.
   * @param [context] The input mode context.
   * @param [rectangle] The marquee selection box.
   * @param [node] The node to which this style instance is assigned.
   * @return `true` if the specified node is visible and selected by the marquee rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-isInBox">Online Documentation</a>
   */
  protected open fun isInBox(
    context: IInputModeContext,
    rectangle: Rect,
    node: INode,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified node is included in the lasso selection.
   * @param [context] The input mode context.
   * @param [path] The lasso selection path.
   * @param [node] The node to which this style instance is assigned.
   * @return `true` if the specified node is visible and selected by the lasso path, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-isInPath">Online Documentation</a>
   */
  protected open fun isInPath(
    context: IInputModeContext,
    path: GeneralPath,
    node: INode,
  ): Boolean
  
  /**
   * Determines whether the provided point is geometrically inside the visual bounds of the node.
   * @param [node] The node to which this style instance is assigned.
   * @param [location] The point to test.
   * @return Whether the point is considered to lie inside the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-isInside">Online Documentation</a>
   */
  protected open fun isInside(
    node: INode,
    location: Point,
  ): Boolean
  
  /**
   * Determines whether the visualization for the specified node is visible in the context.
   * @param [context] The canvas context.
   * @param [rectangle] The clipping rectangle.
   * @param [node] The node to which this style instance is assigned.
   * @return `true` if the specified node is visible in the clipping rectangle; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-isVisible">Online Documentation</a>
   */
  protected open fun isVisible(
    context: ICanvasContext,
    rectangle: Rect,
    node: INode,
  ): Boolean
  
  /**
   * Performs the [lookup][yfiles.collections.ILookup] operation for the [getContext][INodeStyleRenderer] that has been queried from the [renderer][NodeStyleBase].
   * @param [node] The node to use for the context lookup.
   * @param [type] The type to query.
   * @return An implementation of the `type` or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-lookup">Online Documentation</a>
   */
  protected open fun <T : Any> lookup(
    node: INode,
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Updates a visual representation for `node` previously created by [createVisual][NodeStyleBase].
   * @param [context] The render context.
   * @param [oldVisual] The visual that has been created in the call to [createVisual][NodeStyleBase].
   * @param [node] The node to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [createVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleBase%23NodeStyleBase-method-updateVisual">Online Documentation</a>
   */
  protected open fun updateVisual(
    context: IRenderContext,
    oldVisual: TVisual,
    node: INode,
  ): TVisual?
  
  companion object : ClassMetadata<NodeStyleBase<*>> {
  }
}
