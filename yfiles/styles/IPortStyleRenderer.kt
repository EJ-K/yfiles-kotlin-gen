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
import yfiles.graph.IPort
import yfiles.input.IHitTestable
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.InterfaceMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * Interface used by [IPortStyle] implementations that can be used to query the actual [IVisualCreator], [IBoundsProvider], [IHitTestable], [IVisibilityTestable], [IMarqueeTestable], and [ILassoTestable] implementations for a port and an associated style.
 * @see [IPortStyle]
 * @see [IPort]
 * @see [INodeStyleRenderer]
 * @see [IEdgeStyleRenderer]
 * @see [ILabelStyleRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer">Online Documentation</a>
 */
external interface IPortStyleRenderer  {
  /**
   * Gets an implementation of the [IBoundsProvider] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for calculating the rendering bounds
   * @return An implementation that may be used to subsequently query the port's rendering bounds. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getBoundsProvider">Online Documentation</a>
   */
  fun getBoundsProvider(
    port: IPort,
    style: IPortStyle,
  ): IBoundsProvider
  
  /**
   * Gets a temporary context instance that can be used to query additional information for the port's style.
   * @param [port] The port to provide a context instance for.
   * @param [style] The style to use for the context.
   * @return A non-`null` lookup implementation.
   * @see [ILookup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getContext">Online Documentation</a>
   */
  fun getContext(
    port: IPort,
    style: IPortStyle,
  ): ILookup
  
  /**
   * Gets an implementation of the [IHitTestable] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for calculating hit tests
   * @return An implementation that may be used to subsequently perform hit tests. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may return `null` to indicate that the port cannot be hit tested.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getHitTestable">Online Documentation</a>
   */
  fun getHitTestable(
    port: IPort,
    style: IPortStyle,
  ): IHitTestable
  
  /**
   * Gets an implementation of the [ILassoTestable] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for calculating lasso intersection tests
   * @return An implementation that may be used to subsequently query the lasso intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getLassoTestable">Online Documentation</a>
   */
  fun getLassoTestable(
    port: IPort,
    style: IPortStyle,
  ): ILassoTestable
  
  /**
   * Gets an implementation of the [IMarqueeTestable] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for calculating marquee intersection tests
   * @return An implementation that may be used to subsequently query the marquee intersections. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
   */
  fun getMarqueeTestable(
    port: IPort,
    style: IPortStyle,
  ): IMarqueeTestable
  
  /**
   * Gets an implementation of the [IVisibilityTestable] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for testing the visibility
   * @return An implementation that may be used to subsequently query the port's visibility. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
   */
  fun getVisibilityTestable(
    port: IPort,
    style: IPortStyle,
  ): IVisibilityTestable
  
  /**
   * Gets an implementation of the [IVisualCreator] interface that can handle the provided port and its associated style.
   * @param [port] The port to provide an instance for
   * @param [style] The style to use for creating the port visualization
   * @return An implementation that may be used to subsequently create or update the visual for the port. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may not return `null` but should yield a [void][IVisualCreator] implementation instead.
   * @see [IVisualCreator.VOID_VISUAL_CREATOR]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyleRenderer%23IPortStyleRenderer-method-getVisualCreator">Online Documentation</a>
   */
  fun getVisualCreator(
    port: IPort,
    style: IPortStyle,
  ): IVisualCreator

  
  companion object : InterfaceMetadata<IPortStyleRenderer> {
  }
}
