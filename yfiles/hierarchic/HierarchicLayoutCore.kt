// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.GraphObject
import yfiles.algorithms.GraphObjectDpKey
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.GroupingSupport
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This class arranges graphs in a hierarchic/layered fashion and supports complete re-layout as well as incremental graph layout.
 * @see [HierarchicLayout]
 * @see [ILayerer]
 * @see [ISequencer]
 * @see [IPortAllocator]
 * @see [IDrawingDistanceCalculator]
 * @see [INodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore">Online Documentation</a>
 * 
 * @constructor Creates a new [HierarchicLayoutCore] instance with the default settings.
 * @see [createLayerer]
 * @see [createIncrementalLayerer]
 * @see [createSequencer]
 * @see [createDrawingDistanceCalculator]
 * @see [createNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-constructor-HierarchicLayoutCore">Online Documentation</a>
 */
external open class HierarchicLayoutCore  () : MultiStageLayout {

/**
 * Gets or sets whether or not the [ComponentLayout][yfiles.layout.ComponentLayout] should be enabled.
 * 
 * Default value - `false`. [ComponentLayout][yfiles.layout.ComponentLayout] is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Factory method called during the initialization of this [HierarchicLayoutCore] instance that creates a [label layouter][MultiStageLayout.labeling].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23createLabelLayout">Online Documentation</a>
 */
protected open val createLabelLayout: ILayoutStage
/**
 * Gets or sets the [IDrawingDistanceCalculator] instance responsible for determining the minimum distances between elements that belong to the same layer.
 * @see [createDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23drawingDistanceCalculator">Online Documentation</a>
 */
open var drawingDistanceCalculator: IDrawingDistanceCalculator
/**
 * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
 * 
 * Default value - `0`. There is no grid specified.
 * @see [IIncrementalHintsFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the [ILayerer] instance responsible for generating the layer assignment (first phase of the layout algorithm).
 * @see [createLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23layerer">Online Documentation</a>
 */
open var layerer: ILayerer
/**
 * Gets or sets the time limit (in milliseconds) set for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the [INodePlacer] instance responsible for the assignment of the x-(sequence) and preliminary y-coordinates of the nodes.
 * @see [createNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23nodePlacer">Online Documentation</a>
 */
open var nodePlacer: INodePlacer
/**
 * Gets or sets the [IPortAllocator] instance responsible for assigning port coordinates to the adjacent edges of each node.
 * @see [createPortAllocator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23portAllocator">Online Documentation</a>
 */
open var portAllocator: IPortAllocator
/**
 * Gets or sets the [IPortConstraintOptimizer] instance responsible for optimizing the assignment of port constraints to the adjacent edges of each node.
 * @see [createPortConstraintOptimizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23portConstraintOptimizer">Online Documentation</a>
 */
open var portConstraintOptimizer: IPortConstraintOptimizer?
/**
 * Gets or sets the [ISequencer] instance responsible for calculating the sequence of nodes within each layer (second phase of the layout algorithm).
 * @see [createSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23sequencer">Online Documentation</a>
 */
open var sequencer: ISequencer
/**
 * Calculates a hierarchic layout of the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Factory method that is called lazily upon first usage by [drawingDistanceCalculator] if the given [IDrawingDistanceCalculator] instance is `null`.
 * 
 * The default implementation returns a [DefaultDrawingDistanceCalculator] instance. It may be overridden to return a custom [DefaultDrawingDistanceCalculator] instance.
 * @return a [IDrawingDistanceCalculator] instance
 * @see [drawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createDrawingDistanceCalculator">Online Documentation</a>
 */
 open protected   fun createDrawingDistanceCalculator():IDrawingDistanceCalculator
/**
 * Factory method called during [applyLayoutCore] and reates an appropriate [IEdgeReverser] implementation.
 * @return an implementation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createEdgeReverser">Online Documentation</a>
 */
 open protected   fun createEdgeReverser():IEdgeReverser
/**
 * Factory method that is called during [applyLayoutCore] and creates a [GroupingSupport] instance in case of a grouped graph.
 * @param [graph] the input graph
 * @return a [GroupingSupport] instance or `null` if the graph is not grouped
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createGrouping">Online Documentation</a>
 */
 open protected   fun createGrouping( graph: LayoutGraph ):GroupingSupport?
/**
 * Creates an [IIncrementalHintsFactory] implementation used for obtaining hint objects associated with nodes and edges of the graph prior to the invocation of the layout algorithm.
 * @return an [IIncrementalHintsFactory] instance
 * @see [INCREMENTAL_HINTS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createIncrementalHintsFactory">Online Documentation</a>
 */
 open   fun createIncrementalHintsFactory():IIncrementalHintsFactory
/**
 * Factory method called during [applyLayoutCore] and creates an appropriate [ILayerer] implementation.
 * @return a [ILayerer] implementation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createIncrementalLayerer">Online Documentation</a>
 */
 open protected   fun createIncrementalLayerer():ILayerer
/**
 * Callback method that is called during [applyLayoutCore], creates the [INodeData] and [IEdgeData] instances and binds them to the elements using the given [itemFactory][IItemFactory].
 * @param [g] the input graph
 * @param [itemFactory] the given [IItemFactory] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createItemData">Online Documentation</a>
 */
 open protected   fun createItemData( g: LayoutGraph ,
 itemFactory: IItemFactory )
/**
 * Creates a [layer constraint factory][ILayerConstraintFactory] that allows to create hints that affect the assignment of the nodes to layers.
 * @param [graph] the given graph
 * @return a [ILayerConstraintFactory] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createLayerConstraintFactory">Online Documentation</a>
 */
 open   fun createLayerConstraintFactory( graph: Graph ):ILayerConstraintFactory
/**
 * Factory method that is called lazily upon first usage by [layerer] if no [ILayerer] instance is given as input.
 * 
 * The default implementation returns a `new MultiComponentLayerer(new WeightedLayerer())` instance. It may be overridden to return a custom [ILayerer] instance.
 * @return a [ILayerer] instance
 * @see [layerer]
 * @see [MultiComponentLayerer]
 * @see [WeightedLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createLayerer">Online Documentation</a>
 */
 open protected   fun createLayerer():ILayerer
/**
 * Factory method called during [applyLayoutCore] and creates an appropriate [ILayers] implementation using the given [ILayoutDataProvider] instance.
 * @param [ldp] the given [ILayoutDataProvider] instance
 * @return a [ILayers] implementation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createLayers">Online Documentation</a>
 */
 open protected   fun createLayers( ldp: ILayoutDataProvider ):ILayers
/**
 * Factory method that is called lazily upon first usage by [nodePlacer] if the given [INodePlacer] instance is `null`.
 * 
 * The default implementation returns a [SimplexNodePlacer] instance. It may be overridden to return a custom [INodePlacer] instance.
 * @return a [INodePlacer] instance
 * @see [nodePlacer]
 * @see [SimplexNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createNodePlacer">Online Documentation</a>
 */
 open protected   fun createNodePlacer():INodePlacer
/**
 * Factory method that is called lazily upon first usage by [portAllocator] if the given [IPortAllocator] instance is `null`.
 * 
 * The default implementation returns a [DefaultPortAllocator] instance. It may be overridden to return a custom [IPortAllocator] instance.
 * @return a [IPortAllocator] instance
 * @see [portAllocator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createPortAllocator">Online Documentation</a>
 */
 open protected   fun createPortAllocator():IPortAllocator
/**
 * Factory method that is called lazily upon first usage by [portConstraintOptimizer] if the given [IPortConstraintOptimizer] instance is `null`.
 * 
 * The default implementation returns `null`. It may be overridden to return a custom [IPortConstraintOptimizer] instance.
 * @return `null`
 * @see [portConstraintOptimizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createPortConstraintOptimizer">Online Documentation</a>
 */
 open protected   fun createPortConstraintOptimizer():IPortConstraintOptimizer?
/**
 * Creates sequence constraints that affect the sequence of the nodes within each layer.
 * @param [graph] the given graph
 * @return a [ISequenceConstraintFactory] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createSequenceConstraintFactory">Online Documentation</a>
 */
 open   fun createSequenceConstraintFactory( graph: Graph ):ISequenceConstraintFactory
/**
 * Factory method that is called lazily upon first usage by [sequencer] if the given [ISequencer] instance is `null`.
 * 
 * The default implementation returns a [DefaultLayerSequencer] instance. It may be overridden to return a custom [ISequencer] instance.
 * @return a [ISequencer] instance
 * @see [sequencer]
 * @see [DefaultLayerSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createSequencer">Online Documentation</a>
 */
 open protected   fun createSequencer():ISequencer
/**
 * Factory method called during [applyLayoutCore] and creates a [ISequencer] implementation that can sequence subgraphs incrementally.
 * @return a [ISequencer] implementation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-createSubgraphLayerSequencer">Online Documentation</a>
 */
 open protected   fun createSubgraphLayerSequencer():ISequencer
/**
 * Provides access to implementation specific properties of the algorithms used.
 * @param [key] the key to a property
 * @return the associated property value or `null`
 * @see [setAlgorithmProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-getAlgorithmProperty">Online Documentation</a>
 */
 open   fun getAlgorithmProperty( key: Any ):Any?
/**
 * Callback method called during [applyLayoutCore] and returns a [IDataProvider] that holds the [EdgeLayoutDescriptor] information.
 * @param [graph] the input graph
 * @return a [IDataProvider] instance or `null`
 * @see [EdgeLayoutDescriptor]
 * @see [EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-getEdgeLayoutDescriptors">Online Documentation</a>
 */
 open protected   fun getEdgeLayoutDescriptors( graph: LayoutGraph ):IDataProvider<Edge, EdgeLayoutDescriptor>?
/**
 * Callback method called during [applyLayoutCore] and returns a [IDataProvider] that holds the incremental hints information.
 * @param [graph] the input graph
 * @return a [IDataProvider] instance or `null`
 * @see [INCREMENTAL_HINTS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-getIncrementalHints">Online Documentation</a>
 */
 open protected   fun getIncrementalHints( graph: LayoutGraph ):IDataProvider<GraphObject, IncrementalHint>?
/**
 * Callback method called during [applyLayoutCore] and returns a [IDataProvider] that holds the [NodeLayoutDescriptor] information.
 * @param [graph] the input graph
 * @return a [IDataProvider] instance or `null`
 * @see [NodeLayoutDescriptor]
 * @see [NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-getNodeLayoutDescriptors">Online Documentation</a>
 */
 open protected   fun getNodeLayoutDescriptors( graph: LayoutGraph ):IDataProvider<Node, NodeLayoutDescriptor>?
/**
 * Callback method called during [applyLayoutCore] and returns a [IDataProvider] that holds the [SwimlaneDescriptor] information.
 * @param [graph] the input graph
 * @return a [IDataProvider] instance or `null`
 * @see [SwimlaneDescriptor]
 * @see [SWIMLANE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-getSwimLaneDescriptors">Online Documentation</a>
 */
 open protected   fun getSwimLaneDescriptors( graph: LayoutGraph ):IDataProvider<Node, SwimlaneDescriptor>?
/**
 * Callback method that publishes the layering information.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] implementation that provides the layering information
 * @see [LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-publishLayers">Online Documentation</a>
 */
 open protected   fun publishLayers( graph: LayoutGraph ,
 layers: ILayers )
/**
 * Callback method that publishes the sequencing information.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] implementation that provides the layering and sequencing information
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @see [SEQUENCE_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-publishSequences">Online Documentation</a>
 */
 open protected   fun publishSequences( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Removes the bends which are obviously not necessary.
 * @param [graph] the input graph
 * @param [threshold] this method removes a bend, if its horizontal/vertical distance to the closest collinear bend is above this threshold
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-reduceBendCount">Online Documentation</a>
 */
 open protected   fun reduceBendCount( graph: LayoutGraph ,
 threshold: Double?  = definedExternally)
/**
 * Provides access to implementation specific properties of the algorithms used.
 * @param [key] the key to a property
 * @param [propertyValue] the value to associate with the key
 * @see [setAlgorithmProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23HierarchicLayoutCore-method-setAlgorithmProperty">Online Documentation</a>
 */
 open   fun setAlgorithmProperty( key: Any ,
 propertyValue: Any )

companion object : ClassMetadata<HierarchicLayoutCore> {
/**
 * A data provider key for providing layout information for each edge.
 * @see [IEdgeData.edgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23EDGE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_LAYOUT_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeLayoutDescriptor>
/**
 * A data provider key for specifying incremental hints.
 * @see [INCREMENTAL_HINTS_DP_KEY]
 * @see [IIncrementalHintsFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23INCREMENTAL_HINTS_DP_KEY">Online Documentation</a>
 */
 val INCREMENTAL_HINTS_DP_KEY: GraphObjectDpKey<IncrementalHint>
/**
 * A data provider key for internal use only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23INCREMENTAL_NODES_DP_KEY">Online Documentation</a>
 */
 val INCREMENTAL_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data acceptor key for publishing the layer IDs for all nodes in the graph.
 * @see [HierarchicLayout.LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23LAYER_INDEX_DP_KEY">Online Documentation</a>
 */
 val LAYER_INDEX_DP_KEY: NodeDpKey<Int>
/**
 * A data provider key for providing layout information for each node.
 * @see [INodeData.nodeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23NODE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val NODE_LAYOUT_DESCRIPTOR_DP_KEY: NodeDpKey<NodeLayoutDescriptor>
/**
 * A data acceptor key for publishing the index inside their layer for all nodes in the graph.
 * @see [HierarchicLayout.SEQUENCE_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23SEQUENCE_INDEX_DP_KEY">Online Documentation</a>
 */
 val SEQUENCE_INDEX_DP_KEY: NodeDpKey<Int>
/**
 * A data provider key for providing information about swimlanes.
 * @see [SwimlaneDescriptor]
 * @see [INodeData.swimLaneDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutCore%23SWIMLANE_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val SWIMLANE_DESCRIPTOR_DP_KEY: NodeDpKey<SwimlaneDescriptor>
}
}

inline fun HierarchicLayoutCore(
    block: HierarchicLayoutCore.() -> Unit
): HierarchicLayoutCore {
    return HierarchicLayoutCore()
        .apply(block)
}
