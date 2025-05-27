// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph

/**
 * This algorithm arranges graphs in an organic fashion and offers special functionality to interact with the graph while the algorithm is running.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [InteractiveOrganicLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-constructor-InteractiveOrganicLayout">Online Documentation</a>
 */
external open class InteractiveOrganicLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the compactness factor for the layout algorithm.
 * 
 * Default value - `0.4`
 * @throws ArgumentError if the specified value is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23compactnessFactor">Online Documentation</a>
 */
open var compactnessFactor: Double
/**
 * Gets the time when the last wake-up, that is, call to [wakeUp], occurred.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23lastWakeupTime">Online Documentation</a>
 */
open val lastWakeupTime: Int
/**
 * Gets or sets the maximum duration in milliseconds that this algorithm is allowed to run.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. No time restriction is imposed.
 * @throws ArgumentError if the specified maximum duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets an [OutputRestriction] which restricts the area for the layout result of this algorithm.
 * 
 * Default value - [OutputRestriction.NONE]. No area restriction is imposed.
 * @throws ArgumentError if the given restriction is `null`
 * @see [OutputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23outputRestriction">Online Documentation</a>
 */
open var outputRestriction: OutputRestriction
/**
 * Gets or sets the default preferred edge length.
 * 
 * Default value - `50`
 * @throws ArgumentError if the specified edge length is negative
 * @see [setPreferredEdgeLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23preferredEdgeLength">Online Documentation</a>
 */
open var preferredEdgeLength: Double
/**
 * Gets or sets the preferred distance between nodes.
 * 
 * Default value - `50`
 * @throws ArgumentError if the specified minimum node distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23preferredNodeDistance">Online Documentation</a>
 */
open var preferredNodeDistance: Double
/**
 * Gets or sets the ratio of layout quality versus running time.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23qualityTimeRatio">Online Documentation</a>
 */
open var qualityTimeRatio: Double
/**
 * Gets whether or not this layout algorithm is currently running.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23running">Online Documentation</a>
 */
open val running: Boolean
/**
 * Gets whether or not this layout algorithm is currently sleeping.
 * @see [wakeUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23sleeping">Online Documentation</a>
 */
open val sleeping: Boolean
/**
 * Gets whether or not this layout algorithm has stopped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23stopped">Online Documentation</a>
 */
open val stopped: Boolean
/**
 * Schedules an update for the structure of the graph, which will automatically be executed at a later point in the life-cycle of this algorithm.
 * @param [handler] The handler delegate that will be invoked using `null` as the sender and `event` as the event arguments
 * @param [event] The event argument that will be piped to the `handler` invocation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-addStructureUpdate">Online Documentation</a>
 */
 open   fun addStructureUpdate( handler: EventHandler ,
 event: EventArgs )
/**
 * Calculates an organic layout for the given input graph, however, the layout is **not automatically applied** to the graph.
 * @param [graph] the input graph
 * @see [startLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Writes calculated intermediate locations of nodes and edges to the actual graph.
 * @see [commitPositionsSmoothly]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-commitPositions">Online Documentation</a>
 */
 open   fun commitPositions()
/**
 * Writes calculated intermediate locations of nodes and edges to the actual graph and returns the largest movement value.
 * @param [maxMovement] the maximum distance a node will be moved
 * @param [factor] a factor that determines the node movement
 * @return the largest movement value or `0`, if the calculated layout has been transferred completely
 * @see [commitPositions]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-commitPositionsSmoothly">Online Documentation</a>
 */
 open   fun commitPositionsSmoothly( maxMovement: Double ,
 factor: Double ):Double
/**
 * Disables all predefined [ILayoutStage][yfiles.layout.ILayoutStage]s so that upon [applyLayout] only the internal organic layout algorithm will be executed.
 * @see [MultiStageLayout.disableAllStages][yfiles.layout.MultiStageLayout.disableAllStages]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-disableAllStages">Online Documentation</a>
 */
 open   fun disableAllStages()
/**
 * Polls the current coordinates of the center of the given node.
 * @param [node] the node for which the center should be polled
 * @return the [YPoint] representing the center location of the given node, or `null` if nothing about the node is known
 * @see [setCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-getCenter">Online Documentation</a>
 */
 open   fun getCenter( node: Node ):YPoint?
/**
 * Polls the current x-coordinate of the center location of the given node.
 * @param [node] the node for which the x-coordinate should be polled
 * @return the x-coordinate of the center location of the given node
 * @see [setCenterX]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-getCenterX">Online Documentation</a>
 */
 open   fun getCenterX( node: Node ):Double
/**
 * Polls the current y-coordinate of the center location of the given node.
 * @param [node] the node for which the y-coordinate should be polled
 * @return the y-coordinate of the center location of the given node
 * @see [setCenterY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-getCenterY">Online Documentation</a>
 */
 open   fun getCenterY( node: Node ):Double
/**
 * Polls the current stress value of a given node.
 * @param [node] the node for which the stress value should be polled
 * @return the stress value of the given node
 * @see [setStress]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-getStress">Online Documentation</a>
 */
 open   fun getStress( node: Node ):Double
/**
 * Schedules an update for the center location of the given node.
 * @param [node] the node that should be updated
 * @param [x] the desired x-coordinate of the given node
 * @param [y] the desired y-coordinate of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setCenter">Online Documentation</a>
 */
 open   fun setCenter( node: Node ,
 x: Double ,
 y: Double )
/**
 * Schedules an update for the center location's x-coordinate of the given node.
 * @param [node] the node that should be updated
 * @param [x] the desired x-coordinate of the given node
 * @see [setCenterY]
 * @see [setCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setCenterX">Online Documentation</a>
 */
 open   fun setCenterX( node: Node ,
 x: Double )
/**
 * Schedules an update for the center location's y-coordinate of the given node.
 * @param [node] the node that should be updated
 * @param [y] the desired y-coordinate of the given node
 * @see [setCenterX]
 * @see [setCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setCenterY">Online Documentation</a>
 */
 open   fun setCenterY( node: Node ,
 y: Double )
/**
 * Schedules an update for the inertia of the given node.
 * @param [node] the node whose inertia to set
 * @param [inertia] an inertia value between `0` and `1`
 * @throws ArgumentError if the given inertia value is negative or greater than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setInertia">Online Documentation</a>
 */
 open   fun setInertia( node: Node ,
 inertia: Double )
/**
 * Schedules an update for the preferred length of the given edge.
 * @param [edge] the edge whose preferred length should be updated
 * @param [newEdgeLength] the new preferred edge length
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setPreferredEdgeLength">Online Documentation</a>
 */
 open   fun setPreferredEdgeLength( edge: Edge ,
 newEdgeLength: Double )
/**
 * Schedules an update for the radius of the given node.
 * @param [node] the node whose radius should be updated
 * @param [radius] the desired radius for the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setRadius">Online Documentation</a>
 */
 open   fun setRadius( node: Node ,
 radius: Double )
/**
 * Schedules an update for the stress value of the given node.
 * @param [node] the node whose stress value should be updated
 * @param [stress] a stress value from the interval `[0,1]`
 * @throws ArgumentError if the given stress value is negative or greater than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-setStress">Online Documentation</a>
 */
 open   fun setStress( node: Node ,
 stress: Double )
/**
 * Creates a [context object][InteractiveOrganicLayoutExecutionContext] that provides methods to [continue][InteractiveOrganicLayoutExecutionContext.continueLayout] and [stop][InteractiveOrganicLayoutExecutionContext.stopLayout] the layout calculation for running this layout algorithm in a single-threaded environment.
 * @param [graph] the input graph
 * @return a [context instance][InteractiveOrganicLayoutExecutionContext] to control layout calculation
 * @see [InteractiveOrganicLayoutExecutionContext]
 * @see [applyLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-startLayout">Online Documentation</a>
 */
 open   fun startLayout( graph: LayoutGraph ):InteractiveOrganicLayoutExecutionContext
/**
 * Stops the layout algorithm.
 * @see [stopped]
 * @see [stopAndWait]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-stop">Online Documentation</a>
 */
 open   fun stop()
/**
 * Stops a previously [started][startLayout] algorithm and then blocks until the current layout calculation is completed.
 * @see [stopped]
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-stopAndWait">Online Documentation</a>
 */
 open   fun stopAndWait()
/**
 * Synchronizes the structure of the graph copy with the original graph.
 * @throws InvalidOperationError if the currently handled graph is not of type [CopiedLayoutGraph][yfiles.layout.CopiedLayoutGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-syncStructure">Online Documentation</a>
 */
 open   fun syncStructure()
/**
 * Wakes up the algorithm with the effect that it will restart/continue the layout calculation.
 * @see [sleeping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-wakeUp">Online Documentation</a>
 */
 open   fun wakeUp()

companion object : ClassMetadata<InteractiveOrganicLayout> {
}
}

inline fun InteractiveOrganicLayout(
    block: InteractiveOrganicLayout.() -> Unit
): InteractiveOrganicLayout {
    return InteractiveOrganicLayout()
        .apply(block)
}
