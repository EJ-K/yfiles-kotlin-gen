// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.collections.ILookup
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.InterfaceMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * Interface used by [INodeStyle] implementations that can be used to query the actual [IVisualCreator], [IBoundsProvider], [IHitTestable], [IMarqueeTestable], and [ILassoTestable] implementations for a node and an associated style.
 * @see [INodeStyle]
 * @see [INode]
 * @see [IEdgeStyleRenderer]
 * @see [ILabelStyleRenderer]
 * @see [IPortStyleRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer">Online Documentation</a>
 */
external interface INodeStyleRenderer  {
  /**
   * Gets an implementation of the [IBoundsProvider] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for calculating the rendering bounds
   * @return An implementation that may be used to subsequently query the node's rendering bounds. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
   */
  fun getBoundsProvider(
    node: INode,
    style: INodeStyle,
  ): IBoundsProvider
  
  /**
   * Gets a temporary context instance that can be used to query additional information for the node's style.
   * @param [node] The node to provide a context instance for.
   * @param [style] The style to use for the context.
   * @return A non-`null` lookup implementation.
   * @see [ILookup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getContext">Online Documentation</a>
   */
  fun getContext(
    node: INode,
    style: INodeStyle,
  ): ILookup
  
  /**
   * Gets an implementation of the [IHitTestable] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for calculating hit tests
   * @return An implementation that may be used to subsequently perform hit tests. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may return `null` to indicate that the node cannot be hit tested.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getHitTestable">Online Documentation</a>
   */
  fun getHitTestable(
    node: INode,
    style: INodeStyle,
  ): IHitTestable
  
  /**
   * Gets an implementation of the [ILassoTestable] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for calculating lasso intersection tests
   * @return An implementation that may be used to subsequently query if the item is deemed to be inside a lasso selection path. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getLassoTestable">Online Documentation</a>
   */
  fun getLassoTestable(
    node: INode,
    style: INodeStyle,
  ): ILassoTestable
  
  /**
   * Gets an implementation of the [IMarqueeTestable] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for calculating marquee intersection tests
   * @return An implementation that may be used to subsequently query the marquee intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
   */
  fun getMarqueeTestable(
    node: INode,
    style: INodeStyle,
  ): IMarqueeTestable
  
  /**
   * Gets an implementation of the [IShapeGeometry] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for calculating the path geometry
   * @return An implementation that may be used to subsequently query geometry information from. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
   */
  fun getShapeGeometry(
    node: INode,
    style: INodeStyle,
  ): IShapeGeometry
  
  /**
   * Gets an implementation of the [IVisibilityTestable] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for testing the visibility
   * @return An implementation that may be used to subsequently query the node's visibility. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
   */
  fun getVisibilityTestable(
    node: INode,
    style: INodeStyle,
  ): IVisibilityTestable
  
  /**
   * Gets an implementation of the [IVisualCreator] interface that can handle the provided node and its associated style.
   * @param [node] The node to provide an instance for
   * @param [style] The style to use for creating the node visualization
   * @return An implementation that may be used to subsequently create or update the visual for the node. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may not return `null` but should yield a [void][IVisualCreator] implementation instead.
   * @see [IVisualCreator.VOID_VISUAL_CREATOR]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyleRenderer%23INodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
   */
  fun getVisualCreator(
    node: INode,
    style: INodeStyle,
  ): IVisualCreator

  
  companion object : InterfaceMetadata<INodeStyleRenderer> {
  }
}
