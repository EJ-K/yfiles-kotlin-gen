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
import yfiles.graph.IEdge
import yfiles.input.IHitTestable
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.InterfaceMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * Interface used by [IEdgeStyle] implementations that can be used to query the actual [IVisualCreator], [IVisibilityTestable], [IBoundsProvider], [IHitTestable], [IMarqueeTestable], and [ILassoTestable] implementations for an edge and an associated style.
 * @see [IEdgeStyle]
 * @see [IEdge]
 * @see [INodeStyleRenderer]
 * @see [ILabelStyleRenderer]
 * @see [IPortStyleRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer">Online Documentation</a>
 */
external interface IEdgeStyleRenderer  {
  /**
   * Gets an implementation of the [IBoundsProvider] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for calculating the rendering bounds
   * @return An implementation that may be used to subsequently query the edge's rendering bounds. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
   */
  fun getBoundsProvider(
    edge: IEdge,
    style: IEdgeStyle,
  ): IBoundsProvider
  
  /**
   * Gets a temporary context instance that can be used to query additional information for the edge's style.
   * @param [edge] The edge to provide a context instance for.
   * @param [style] The style to use for the context.
   * @return A non-`null` lookup implementation.
   * @see [ILookup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getContext">Online Documentation</a>
   */
  fun getContext(
    edge: IEdge,
    style: IEdgeStyle,
  ): ILookup
  
  /**
   * Gets an implementation of the [IHitTestable] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for calculating hit tests
   * @return An implementation that may be used to subsequently perform hit tests. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may return `null` to indicate that the edge cannot be hit tested.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getHitTestable">Online Documentation</a>
   */
  fun getHitTestable(
    edge: IEdge,
    style: IEdgeStyle,
  ): IHitTestable
  
  /**
   * Gets an implementation of the [ILassoTestable] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for calculating lasso intersection tests.
   * @return An implementation that may be used to subsequently query the lasso intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getLassoTestable">Online Documentation</a>
   */
  fun getLassoTestable(
    edge: IEdge,
    style: IEdgeStyle,
  ): ILassoTestable
  
  /**
   * Gets an implementation of the [IMarqueeTestable] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for calculating marquee intersection tests.
   * @return An implementation that may be used to subsequently query the marquee intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
   */
  fun getMarqueeTestable(
    edge: IEdge,
    style: IEdgeStyle,
  ): IMarqueeTestable
  
  /**
   * Gets an implementation of the [IPathGeometry] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for calculating the path geometry
   * @return An implementation that may be used to subsequently query geometry information from. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getPathGeometry">Online Documentation</a>
   */
  fun getPathGeometry(
    edge: IEdge,
    style: IEdgeStyle,
  ): IPathGeometry
  
  /**
   * Gets an implementation of the [IVisibilityTestable] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for testing the visibility
   * @return An implementation that may be used to subsequently query the edge's visibility. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
   */
  fun getVisibilityTestable(
    edge: IEdge,
    style: IEdgeStyle,
  ): IVisibilityTestable
  
  /**
   * Gets an implementation of the [IVisualCreator] interface that can handle the provided edge and its associated style.
   * @param [edge] The edge to provide an instance for
   * @param [style] The style to use for creating the edge visualization
   * @return An implementation that may be used to subsequently create or update the visual for the edge. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may not return `null` but should yield a [void][IVisualCreator] implementation instead.
   * @see [IVisualCreator.VOID_VISUAL_CREATOR]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyleRenderer%23IEdgeStyleRenderer-method-getVisualCreator">Online Documentation</a>
   */
  fun getVisualCreator(
    edge: IEdge,
    style: IEdgeStyle,
  ): IVisualCreator

  
  companion object : InterfaceMetadata<IEdgeStyleRenderer> {
  }
}
