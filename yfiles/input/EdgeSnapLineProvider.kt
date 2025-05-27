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
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata

/**
 * An [ISnapLineProvider] implementation that can be used to add snap lines for orthogonally routed [IEdge]s.
 * @see [EdgeDecorator.snapLineProviderDecorator][yfiles.graph.EdgeDecorator.snapLineProviderDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSnapLineProvider">Online Documentation</a>
 */
external open class EdgeSnapLineProvider  : ISnapLineProvider<IEdge> {

/**
 * Adds horizontal snap lines for a horizontally oriented fixed segment snap lines.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [edge] The edge to add snap lines for.
 * @param [segmentStart] The start of the segment.
 * @param [segmentEnd] The end of the segment.
 * @see [addVerticalSegmentSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSnapLineProvider%23EdgeSnapLineProvider-method-addHorizontalSegmentSnapLines">Online Documentation</a>
 */
 open protected   fun addHorizontalSegmentSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 edge: IEdge ,
 segmentStart: Point ,
 segmentEnd: Point )
/**
 * Adds the snap lines for the given model item to the `event`.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [item] The item to add snap lines for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSnapLineProvider%23EdgeSnapLineProvider-method-addSnapLines">Online Documentation</a>
 */
 override   fun addSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 item: IEdge )
/**
 * Adds vertical snap lines for a vertically oriented fixed segment snap lines.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [edge] The edge to add snap lines for.
 * @param [segmentStart] The start of the segment.
 * @param [segmentEnd] The end of the segment.
 * @see [addHorizontalSegmentSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSnapLineProvider%23EdgeSnapLineProvider-method-addVerticalSegmentSnapLines">Online Documentation</a>
 */
 open protected   fun addVerticalSegmentSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 edge: IEdge ,
 segmentStart: Point ,
 segmentEnd: Point )

companion object : ClassMetadata<EdgeSnapLineProvider> {
}
}
