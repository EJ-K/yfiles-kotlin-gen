// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.geometry.GeneralPath
import yfiles.geometry.IMutablePoint
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.ITable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.TimeSpan
import yfiles.lang.YObject
import yfiles.layout.CopiedLayoutGraph

/**
 * An interface for animations that can be run by [Animator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation">Online Documentation</a>
 */
external interface IAnimation : YObject {
/**
 * Gets the preferred duration of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23preferredDuration">Online Documentation</a>
 */
val preferredDuration: TimeSpan
/**
 * Does the animation according to the relative animation time.
 * @param [time] The animation time in [0,1].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-method-animate">Online Documentation</a>
 */
   fun animate( time: Double )
/**
 * Cleans up after an animation has finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-method-cleanUp">Online Documentation</a>
 */
   fun cleanUp()
/**
 * Creates a delayed animation instance from this instance.
 * @param [delay] The delay to wait before the provided animation starts.
 * @return A new animation that will first wait before the animation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createDelayedAnimation">Online Documentation</a>
 */
  final  fun createDelayedAnimation( delay: TimeSpan ):IAnimation = definedExternally
/**
 * Creates an eased animation for the given base animation.
 * @param [easeIn] The ratio for the ease-in time [0,1] where 0 is the start of the animation and 1 the end. `0.5` is the default value.
 * @param [easeOut] The ratio for the ease-out time [0,1] where 0 is the start of the animation and 1 the end. `0.5` is the default value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createEasedAnimation">Online Documentation</a>
 */
  final  fun createEasedAnimation( easeIn: Double?  = definedExternally,
 easeOut: Double?  = definedExternally):IAnimation = definedExternally
/**
 * Initializes the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-method-initialize">Online Documentation</a>
 */
   fun initialize()

companion object : InterfaceMetadata<IAnimation> {
/**
 * Creates a delay animation that does nothing.
 * @param [duration] The value for the [preferredDuration] of the created animation
 * @return An animation that does nothing for amount of time specified in `duration`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createDelay">Online Documentation</a>
 */
   fun createDelay( duration: TimeSpan ):IAnimation
/**
 * Creates a new [IAnimation] that animates the given `edge`'s bends from its current shape linearly to the shape given by the `endBends` and final port locations.
 * @param [graph] The graph the animated edge belongs to.
 * @param [edge] The edge layout to animate.
 * @param [endBends] The bend positions after the animation.
 * @param [endSourceLocation] The absolute position of the source port after the animation.
 * @param [endTargetLocation] The absolute position of the target port after the animation.
 * @param [preferredDuration] The preferred duration of the animation in milliseconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createEdgeSegmentAnimation">Online Documentation</a>
 */
   fun createEdgeSegmentAnimation( graph: IGraph ,
 edge: IEdge ,
 endBends: ReadonlyArray<IPoint> ,
 endSourceLocation: Point ,
 endTargetLocation: Point ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates a new [IAnimation] that animates the given layout of all types of graph items.
 * @param [graph] The graph for which the layout should be animated.
 * @param [targetNodeLayouts] The node layouts after the animation.
 * @param [targetBendLocations] The bend locations after the animation, for each edge the points are interpreted as the position of the bends along the edge in the given order.
 * @param [targetPortLocations] The [IPortLocationModelParameter]s for each [IPort] in the graph that will be morphed.
 * @param [targetLayoutParameters] The label model parameters for each label after the animation.
 * @param [preferredDuration] The preferred duration of the animation in milliseconds. The default is 500 milliseconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createGraphAnimation">Online Documentation</a>
 */
   fun createGraphAnimation( graph: IGraph ,
 targetNodeLayouts: IMapper<INode, IRectangle>?  = definedExternally,
 targetBendLocations: IMapper<IEdge, ReadonlyArray<IPoint>>?  = definedExternally,
 targetPortLocations: IMapper<IPort, IPortLocationModelParameter>?  = definedExternally,
 targetLayoutParameters: IMapper<ILabel, ILabelModelParameter>?  = definedExternally,
 preferredDuration: TimeSpan?  = definedExternally):IAnimation
/**
 * Creates a new [IAnimation] that animates the given `label` from its current layout linearly to the layout given by the `targetLayoutParameter`.
 * @param [graph] The graph that contains the labels.
 * @param [label] The label to animate the parameter of.
 * @param [targetLayoutParameter] The target parameter of the label.
 * @param [preferredDuration] The preferred duration of the animation.
 * @return A new instance of [IAnimation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createLabelAnimation">Online Documentation</a>
 */
   fun createLabelAnimation( graph: IGraph ,
 label: ILabel ,
 targetLayoutParameter: ILabelModelParameter ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates a new [IAnimation] instance that animates the current graph to the layout given by a [CopiedLayoutGraph] instance.
 * @param [graph] the graph for which the layout should be animated
 * @param [layoutGraph] the [CopiedLayoutGraph] that contains all target layout information
 * @param [preferredDuration] the preferred duration of the animation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createLayoutAnimation">Online Documentation</a>
 */
   fun createLayoutAnimation( graph: IGraph ,
 layoutGraph: CopiedLayoutGraph ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates a new [IAnimation] that animates the given `node` from its current layout to the new given `targetLayout`.
 * @param [graph] The graph the animated node belongs to.
 * @param [node] The node whose [INode.layout] to animate.
 * @param [targetLayout] The expected node layout after the animation.
 * @param [preferredDuration] The preferred duration of the animation.
 * @return A new instance of [IAnimation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createNodeAnimation">Online Documentation</a>
 */
   fun createNodeAnimation( graph: IGraph ,
 node: INode ,
 targetLayout: IRectangle ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates an [IAnimation] according to the composite design pattern that animates multiple animations in parallel.
 * @param [animations] The animations to run in parallel.
 * @param [synchronized] Whether all child animations should be adjusted to have the same (maximum) [preferredDuration]. By default this is enabled.
 * @return A new instance that is the composite of the given animations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createParallelAnimation">Online Documentation</a>
 */
   fun createParallelAnimation( animations: IEnumerable<IAnimation> ,
 synchronized: Boolean  = definedExternally):IAnimation
/**
 * Creates a new instance of an [IAnimation] that animates the given [IMutablePoint] along a path.
 * @param [path] The path to animate the point along.
 * @param [animationPoint] The mutable point instance that will be manipulated by the animation.
 * @param [preferredDuration] The preferred duration of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createPathAnimation">Online Documentation</a>
 */
   fun createPathAnimation( path: GeneralPath ,
 animationPoint: IMutablePoint ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates a new [IAnimation] that animates the given `port` from its current location to the new location given by the `targetLocationParameter`.
 * @param [graph] The graph that contains the port.
 * @param [port] The port to animate.
 * @param [targetLocationParameter] The parameter to linearly interpolate to.
 * @param [preferredDuration] The [preferred duration][preferredDuration] of this animation.
 * @return A new instance of [IAnimation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createPortAnimation">Online Documentation</a>
 */
   fun createPortAnimation( graph: IGraph ,
 port: IPort ,
 targetLocationParameter: IPortLocationModelParameter ,
 preferredDuration: TimeSpan ):IAnimation
/**
 * Creates an [IAnimation] that animates multiple animations in sequence.
 * @param [animations] The animations to run in sequence.
 * @return A new sequential animation from the given animations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createSequentialAnimation">Online Documentation</a>
 */
   fun createSequentialAnimation( animations: IEnumerable<IAnimation> ):IAnimation
/**
 * Creates a new [IAnimation] for the given table that animates the table and its [stripes][yfiles.graph.IStripe].
 * @param [table] The table to animate.
 * @param [columnLayout] The sizes of the **leaf** columns, in natural order.
 * @param [rowLayout] The sizes of the **leaf** rows, in natural order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-createTableAnimation">Online Documentation</a>
 */
   fun createTableAnimation( table: ITable ,
 columnLayout: ReadonlyArray<Double> ,
 rowLayout: ReadonlyArray<Double> ):IAnimation
/**
 * Creates an animation for the given delegate and [preferredDuration].
 * @param [callback] The callback to use for the animation steps.
 * @param [duration] The duration that the animation should last.
 * @return A new animation that will use the `callback` to perform the actions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IAnimation%23IAnimation-defaultmethod-fromDelegate">Online Documentation</a>
 */
@JsName("fromDelegate")
  operator fun invoke( callback: AnimationCallback ,
 duration: TimeSpan ):IAnimation
}
}
