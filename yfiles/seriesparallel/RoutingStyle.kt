// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Style constant describing a polyline edge style.
 * @see [SeriesParallelLayout.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutRoutingStyle">Online Documentation</a>
 */
@JsName("SeriesParallelLayoutRoutingStyle")
external sealed class RoutingStyle: YEnum<RoutingStyle> {
   companion object: EnumMetadata<RoutingStyle> {
       /**
 * Style constant describing an orthogonal edge style.
 * 
 * Value - `0`
 * @see [SeriesParallelLayout.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: RoutingStyle

/**
 * Style constant describing an octilinear edge style.
 * 
 * Value - `1`
 * @see [SeriesParallelLayout.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutRoutingStyle%23OCTILINEAR">Online Documentation</a>
 */
val OCTILINEAR: RoutingStyle

/**
 * Style constant describing a polyline edge style.
 * 
 * Value - `2`
 * @see [SeriesParallelLayout.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutRoutingStyle%23POLYLINE">Online Documentation</a>
 */
val POLYLINE: RoutingStyle
   }
}
