// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import js.array.ReadonlyArray
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A [EdgeRouterBusDescriptor] defines settings for edges routed on a common bus by [EdgeRouter].
 * @see [EdgeRouterData.buses]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23EdgeRouterBusDescriptor-constructor-EdgeRouterBusDescriptor">Online Documentation</a>
 */
external class EdgeRouterBusDescriptor ()  {
  /**
   * Gets or sets whether or not bus edges ending at the same node are automatically grouped such that they share a common bus connection.
   * 
   * Default value - `true`. Edges ending at the same node are automatically grouped.
   * @see [EdgeRouterData.sourceGroupIds]
   * @see [EdgeRouterData.targetGroupIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23automaticEdgeGrouping">Online Documentation</a>
   */
  final var automaticEdgeGrouping: Boolean
  
  /**
   * Gets or sets the user-specified bus path that represents the backbone for edges associated with this bus.
   * 
   * Default value - `null`. The algorithm automatically detects a suitable bus.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23busPoints">Online Documentation</a>
   */
  final var busPoints: ReadonlyArray<Point>?
  
  /**
   * Gets the point path that describes the bus computed by the [EdgeRouter].
   * @see [busPoints]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23computedBusPoints">Online Documentation</a>
   */
  final val computedBusPoints: ReadonlyArray<Point>?
  
  /**
   * Gets or sets the preferred minimum length of backbone segments.
   * 
   * Default value - `100.0`
   * @throws ArgumentError if the given minimum length is smaller than `1.0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23minimumBackboneSegmentLength">Online Documentation</a>
   */
  final var minimumBackboneSegmentLength: Double
  
  /**
   * Gets or sets whether or not the algorithm may create buses that consist of multiple backbone segments.
   * 
   * Default value - `true`. The algorithm may create buses that consist of multiple backbone segments.
   * @see [busPoints]
   * @see [minimumBackboneSegmentLength]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23multipleBackboneSegments">Online Documentation</a>
   */
  final var multipleBackboneSegments: Boolean
  
  companion object : ClassMetadata<EdgeRouterBusDescriptor> {
  }
}

inline fun EdgeRouterBusDescriptor(
    block: EdgeRouterBusDescriptor.() -> Unit
): EdgeRouterBusDescriptor {
    return EdgeRouterBusDescriptor()
        .apply(block)
}
