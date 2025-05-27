// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.EdgeDataKey
import yfiles.layout.LayoutGraph
import yfiles.layout.NodeDataKey

/**
 * This algorithm arranges graphs in an organic fashion and offers special functionality to interact with the graph while the algorithm is running.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [InteractiveOrganicLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-constructor-InteractiveOrganicLayout">Online Documentation</a>
 */
external class InteractiveOrganicLayout ()  {
  /**
   * Gets or sets the compactness factor for the layout algorithm.
   * 
   * Default value - `0.4`
   * @throws ArgumentError if the specified value is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23compactnessFactor">Online Documentation</a>
   */
  final var compactnessFactor: Double
  
  /**
   * Gets or sets the default preferred edge length.
   * 
   * Default value - `50`
   * @throws ArgumentError if the specified edge length is negative
   * @see [InteractiveOrganicEdgeHandle.preferredEdgeLength]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23defaultPreferredEdgeLength">Online Documentation</a>
   */
  final var defaultPreferredEdgeLength: Double
  
  /**
   * Gets the time when the last wake-up, that is, call to [wakeUp][InteractiveOrganicLayout] occurred.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23lastWakeupTime">Online Documentation</a>
   */
  final val lastWakeupTime: Int
  
  /**
   * Gets or sets the preferred distance between nodes.
   * 
   * Default value - `50`
   * @throws ArgumentError if the specified minimum node distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23preferredNodeDistance">Online Documentation</a>
   */
  final var preferredNodeDistance: Double
  
  /**
   * Gets or sets the ratio of layout quality versus running time.
   * 
   * Default value - `1`
   * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23qualityTimeRatio">Online Documentation</a>
   */
  final var qualityTimeRatio: Double
  
  /**
   * Gets whether or not this layout algorithm is currently running.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23running">Online Documentation</a>
   */
  final val running: Boolean
  
  /**
   * Gets or sets an [shapeConstraint][InteractiveOrganicLayout] which restricts the area for the layout result of this algorithm.
   * 
   * Default value - [ShapeConstraint.NONE]. No area restriction is imposed.
   * @throws ArgumentError if the given restriction is `null`
   * @see [ShapeConstraint]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23shapeConstraint">Online Documentation</a>
   */
  final var shapeConstraint: ShapeConstraint
  
  /**
   * Gets whether or not this layout algorithm is currently sleeping.
   * @see [wakeUp]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23sleeping">Online Documentation</a>
   */
  final val sleeping: Boolean
  
  /**
   * Gets or sets the preferred stop duration that this algorithm is allowed to run.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. No time restriction is imposed.
   * @throws ArgumentError if the specified duration has a negative value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets whether or not this layout algorithm has stopped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23stopped">Online Documentation</a>
   */
  final val stopped: Boolean
  
  /**
   * Starts the layout calculation, continuing from where it has stopped before and allowing a certain maximum duration.
   * @param [duration] the duration the layout calculation is allowed to run
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-continueLayout">Online Documentation</a>
   */
  fun continueLayout(
    duration: TimeSpan,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [InteractiveOrganicLayout].
   * @param [graph] The graph that determines the generic type arguments of the created layout data
   * @return An instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [GenericLabeling][yfiles.labeling.GenericLabeling].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-defaultmethod-createLayoutData">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph  = definedExternally,
  ): InteractiveOrganicLayoutData
  
  /**
   * Starts the layout calculation for the given period of time.
   * @param [graph] the input graph
   * @param [duration] the duration the layout calculation is allowed to run
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-startLayout">Online Documentation</a>
   */
  fun startLayout(
    graph: LayoutGraph,
    duration: TimeSpan,
  )
  
  /**
   * Stops the layout algorithm.
   * @see [stopped]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-stopLayout">Online Documentation</a>
   */
  fun stopLayout()
  
  /**
   * Wakes up the algorithm with the effect that it will restart/continue the layout calculation.
   * @see [sleeping]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23InteractiveOrganicLayout-method-wakeUp">Online Documentation</a>
   */
  fun wakeUp()
  
  companion object : ClassMetadata<InteractiveOrganicLayout> {
    /**
     * A [data key][EdgeDataKey] for specifying the [InteractiveOrganicEdgeHandle] instances that provide more information as input and updated information about edges after the layout stopped.
     * @see [InteractiveOrganicEdgeHandle]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23EDGE_HANDLE_DATA_KEY">Online Documentation</a>
     */
     val EDGE_HANDLE_DATA_KEY: EdgeDataKey<InteractiveOrganicEdgeHandle>
    
    /**
     * A [data key][NodeDataKey] for specifying the [InteractiveOrganicNodeHandle] instances that provide more information as input and information about updated positions of nodes after the layout stopped.
     * @see [InteractiveOrganicNodeHandle]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayout%23NODE_HANDLE_DATA_KEY">Online Documentation</a>
     */
     val NODE_HANDLE_DATA_KEY: NodeDataKey<InteractiveOrganicNodeHandle>
  }
}

inline fun InteractiveOrganicLayout(
    block: InteractiveOrganicLayout.() -> Unit
): InteractiveOrganicLayout {
    return InteractiveOrganicLayout()
        .apply(block)
}
