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
import yfiles.algorithms.EdgeDirectedness
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.GraphDpKey
import yfiles.algorithms.GraphObjectDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YPointPath
import yfiles.algorithms.YRectangle
import yfiles.collections.IComparer
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.layout.HierarchicLayoutSubcomponentDescriptor
import yfiles.layout.LayoutGraph
import yfiles.layout.MirrorModes
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges graphs in a hierarchic fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [HierarchicLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-constructor-HierarchicLayout">Online Documentation</a>
 */
external open class HierarchicLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not edges are grouped automatically.
 * 
 * Default value - `false`. Edges are not grouped automatically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23automaticEdgeGrouping">Online Documentation</a>
 */
open var automaticEdgeGrouping: Boolean
/**
 * Gets or sets whether or not reversed edges should be routed as back-loops.
 * 
 * Default value - `false`. There is no back-loop routing applied to reversed edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23backLoopRouting">Online Documentation</a>
 */
open var backLoopRouting: Boolean
/**
 * Gets or sets whether or not self-loops should be routed in a similar manner as back-loops.
 * 
 * Default value - `false`. There is no back-loop routing applied to self-loops.
 * @see [backLoopRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23backLoopRoutingForSelfLoops">Online Documentation</a>
 */
open var backLoopRoutingForSelfLoops: Boolean
/**
 * Gets or sets whether or not layer compaction for recursive group layering is active.
 * 
 * Default value - `false`. The layer compaction is disabled.
 * @see [recursiveGroupLayering]
 * @see [SimplexNodePlacer.groupCompactionStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23compactGroups">Online Documentation</a>
 */
open var compactGroups: Boolean
/**
 * Gets or sets the policy that specifies how to arrange connected components.
 * 
 * Default value - [ComponentArrangementPolicy.TOPMOST]. Connected components are aligned with their first layer.
 * @throws ArgumentError if the specified policy does not match a default component arrangement policy
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23componentArrangementPolicy">Online Documentation</a>
 */
open var componentArrangementPolicy: ComponentArrangementPolicy
/**
 * Gets or sets whether or not the layout algorithm considers node labels when calculating node positions to avoid overlaps.
 * 
 * Default value - `false`. Node labels are not considered.
 * @throws InvalidOperationError if this property should be enabled but the current [labeling algorithm][MultiStageLayout.labeling] is not of type [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator]
 * @throws InvalidOperationError if no properly configured [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator] is registered even though this property was enabled earlier (can happen when manually specifying the [labeling algorithm][MultiStageLayout.labeling]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets the [DefaultDrawingDistanceCalculator] that is registered with the layout algorithm by default.
 * @throws InvalidOperationError if the current instance returned by [HierarchicLayoutCore.drawingDistanceCalculator] is not an instance of [DefaultDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23defaultDrawingDistanceCalculator">Online Documentation</a>
 */
protected open val defaultDrawingDistanceCalculator: DefaultDrawingDistanceCalculator
/**
 * Gets or sets the [EdgeLayoutDescriptor] instance used for all those edges that do not have a specific layout descriptor assigned.
 * 
 * Default value - [EdgeLayoutDescriptor]
 * @throws ArgumentError if the [EdgeLayoutDescriptor] is `null`
 * @see [HierarchicLayoutCore.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23edgeLayoutDescriptor">Online Documentation</a>
 */
open var edgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets the minimum distance between two directly consecutive edges that pass through the same layer.
 * 
 * Default value - `20`
 * @throws ArgumentError if the distance is negative
 * @throws InvalidOperationError if the current [IDrawingDistanceCalculator] is not an instance of [DefaultDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23edgeToEdgeDistance">Online Documentation</a>
 */
open var edgeToEdgeDistance: Double
/**
 * Gets or sets the [ILayerer] instance that obtains the layering for fixed nodes during the incremental layout run.
 * 
 * Default value - [AsIsLayerer]
 * @throws ArgumentError if the [ILayerer] is `null`
 * @see [layoutMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23fixedElementsLayerer">Online Documentation</a>
 */
open var fixedElementsLayerer: ILayerer
/**
 * Gets or sets the [ISequencer] instance that calculates the sequence of the fixed nodes during the incremental layout run.
 * 
 * Default value - [AsIsSequencer]
 * @throws ArgumentError if the given [ISequencer] is `null`
 * @see [layoutMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23fixedElementsSequencer">Online Documentation</a>
 */
open var fixedElementsSequencer: ISequencer
/**
 * Gets or sets the [ILayerer] instance that obtains the layering for the nodes if the layout algorithm runs in [From Scratch mode][LayoutMode.FROM_SCRATCH].
 * 
 * Default value - [WeightedLayerer]
 * @throws ArgumentError if the [ILayerer] is `null`
 * @see [layoutMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23fromScratchLayerer">Online Documentation</a>
 */
open var fromScratchLayerer: ILayerer
/**
 * Gets or sets a predefined layering strategy for the [from scratch][fromScratchLayerer] layerer.
 * 
 * Default value - [LayeringStrategy.HIERARCHICAL_OPTIMAL]
 * @throws ArgumentError if an unknown strategy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23fromScratchLayeringStrategy">Online Documentation</a>
 */
open var fromScratchLayeringStrategy: LayeringStrategy
/**
 * Gets or sets the [ISequencer] instance that calculates the node sequence if the layout algorithm runs in [From Scratch mode][LayoutMode.FROM_SCRATCH].
 * 
 * Default value - [DefaultLayerSequencer]
 * @throws ArgumentError if the [ISequencer] is `null`
 * @see [fromScratchLayerer]
 * @see [layoutMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23fromScratchSequencer">Online Documentation</a>
 */
open var fromScratchSequencer: ISequencer
/**
 * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
 * 
 * Default value - `0`. There is no grid specified.
 * @see [IIncrementalHintsFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the group layer alignment strategy used for recursive group layering.
 * 
 * Default value - [GroupAlignmentPolicy.CENTER]. Groups and normal nodes are center aligned.
 * @throws ArgumentError if an unknown group alignment policy is given
 * @see [recursiveGroupLayering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23groupAlignmentPolicy">Online Documentation</a>
 */
open var groupAlignmentPolicy: GroupAlignmentPolicy
/**
 * Gets the current layout algorithm instance.
 * @see [createHierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23hierarchicLayoutCore">Online Documentation</a>
 */
open val hierarchicLayoutCore: HierarchicLayoutCore
/**
 * Gets or sets whether or not the layout algorithm reserves space for labels and places them.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @throws InvalidOperationError if integrated labeling should be enabled but the current [labeling algorithm][MultiStageLayout.labeling] is not of type [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator]
 * @throws InvalidOperationError if no properly configured [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator] is registered even though integrated labeling was enabled earlier (can happen when manually specifying the [labeling algorithm][MultiStageLayout.labeling]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the layout mode this layouter should use for upcoming layouts.
 * 
 * Default value - [LayoutMode.FROM_SCRATCH]
 * @throws ArgumentError if the given layout mode is unknown
 * @see [fromScratchLayerer]
 * @see [fromScratchSequencer]
 * @see [fixedElementsLayerer]
 * @see [fixedElementsSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23layoutMode">Online Documentation</a>
 */
open var layoutMode: LayoutMode
/**
 * Gets or sets the time limit (in milliseconds) set for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the minimum distance between two adjacent layers.
 * 
 * Default value - `20`
 * @throws ArgumentError if the distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23minimumLayerDistance">Online Documentation</a>
 */
open var minimumLayerDistance: Double
/**
 * Gets or sets the [NodeLayoutDescriptor] instance used for all those nodes that do not have a specific layout descriptor assigned.
 * 
 * Default value - [NodeLayoutDescriptor]
 * @throws ArgumentError if the given [NodeLayoutDescriptor] is `null`
 * @see [HierarchicLayoutCore.NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see [createNodeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23nodeLayoutDescriptor">Online Documentation</a>
 */
open var nodeLayoutDescriptor: NodeLayoutDescriptor
/**
 * Gets or sets the [INodePlacer] instance that will calculate the final node placement of the layout.
 * 
 * Default value - [SimplexNodePlacer]
 * @throws ArgumentError if the [INodePlacer] is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23nodePlacer">Online Documentation</a>
 */
open var nodePlacer: INodePlacer
/**
 * Gets or sets the minimum distance between an edge and an adjacent node in one layer.
 * 
 * Default value - `15`
 * @throws ArgumentError if the distance is negative
 * @throws InvalidOperationError if the current [IDrawingDistanceCalculator] is not an instance of [DefaultDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23nodeToEdgeDistance">Online Documentation</a>
 */
open var nodeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between two adjacent nodes in one layer.
 * 
 * Default value - `30`
 * @throws ArgumentError if the distance is negative
 * @throws InvalidOperationError if the current [IDrawingDistanceCalculator] is not an instance of [DefaultDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23nodeToNodeDistance">Online Documentation</a>
 */
open var nodeToNodeDistance: Double
/**
 * Gets or sets whether or not edges should be routed orthogonally.
 * 
 * Default value - `false`. Edges are not orthogonally routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23orthogonalRouting">Online Documentation</a>
 */
open var orthogonalRouting: Boolean
/**
 * Gets or sets whether or not groups are respected during the layering stage.
 * 
 * Default value - `true`. Groups are layered recursively.
 * @see [compactGroups]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23recursiveGroupLayering">Online Documentation</a>
 */
open var recursiveGroupLayering: Boolean
/**
 * Gets or sets whether or not to separate layers.
 * 
 * Default value - `true`. Layers are separated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23separateLayers">Online Documentation</a>
 */
open var separateLayers: Boolean
/**
 * Gets or sets whether or not to stop the layout algorithm after the layering step.
 * 
 * Default value - `false`. The algorithm calculates the complete layout.
 * @see [LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23stopAfterLayering">Online Documentation</a>
 */
open var stopAfterLayering: Boolean
/**
 * Gets or sets whether or not to stop the layout algorithm after the sequencing step.
 * 
 * Default value - `false`. The algorithm calculates the complete layout.
 * @see [SEQUENCE_INDEX_DP_KEY]
 * @see [LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23stopAfterSequencing">Online Documentation</a>
 */
open var stopAfterSequencing: Boolean
/**
 * Calculates a hierarchic layout of the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Delegates the calculation of the hierarchic layout to a configured [HierarchicLayoutCore] instance.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Configures the core layout algorithm with the settings of this [HierarchicLayout] instance.
 * @param [graph] the input graph
 * @param [coreLayouter] the given core layout algorithm instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-configureCoreLayout">Online Documentation</a>
 */
 open protected   fun configureCoreLayout( graph: LayoutGraph ,
 coreLayouter: HierarchicLayoutCore )
/**
 * Returns a new [EdgeLayoutDescriptor] instance that will be used during the various phases of the layout algorithm to determine the drawing details of the edges of the graph.
 * @return a new [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createEdgeLayoutDescriptor">Online Documentation</a>
 */
 open protected   fun createEdgeLayoutDescriptor():EdgeLayoutDescriptor
/**
 * Returns a new [HierarchicLayoutCore] instance.
 * @return a new [HierarchicLayoutCore] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createHierarchicLayoutCore">Online Documentation</a>
 */
 open protected   fun createHierarchicLayoutCore():HierarchicLayoutCore
/**
 * Returns a [IIncrementalHintsFactory] instance that must be used to obtain hints to be associated with graph elements that should be laid out incrementally.
 * @return a new [IIncrementalHintsFactory] instance
 * @see [HierarchicLayoutCore.createIncrementalHintsFactory]
 * @see [INCREMENTAL_HINTS_DP_KEY]
 * @see [Graph.addDataProvider]
 * @see [layoutMode]
 * @see [LayoutMode.INCREMENTAL]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createIncrementalHintsFactory">Online Documentation</a>
 */
 open   fun createIncrementalHintsFactory():IIncrementalHintsFactory
/**
 * Returns a [ILayerConstraintFactory] instance that can be used for specifying layer constraints for the given graph.
 * @param [graph] the input graph
 * @return a new [ILayerConstraintFactory] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createLayerConstraintFactory(Graph)">Online Documentation</a>
 */
 open   fun createLayerConstraintFactory( graph: Graph ):ILayerConstraintFactory
/**
 * Creates and registers an incremental layer constraint factory for an [IGraph].
 * @param [graph] The graph for which the factory is created
 * @return the sequence constraint factory
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-defaultmethod-createLayerConstraintFactory(IGraph)">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
   fun createLayerConstraintFactory( graph: IGraph ):ILayerConstraintFactory
/**
 * Returns a new [NodeLayoutDescriptor] instance that will be used during the various phases of the layout algorithm to determine the drawing details of the nodes of the graph.
 * @return a new [NodeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createNodeLayoutDescriptor">Online Documentation</a>
 */
 open protected   fun createNodeLayoutDescriptor():NodeLayoutDescriptor
/**
 * Returns a [ISequenceConstraintFactory] instance that can be used for specifying sequence constraints for the given graph.
 * @param [graph] the input graph
 * @return a [ISequenceConstraintFactory] instance
 * @see [fromScratchSequencer]
 * @see [fixedElementsSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-createSequenceConstraintFactory(LayoutGraph)">Online Documentation</a>
 */
 open   fun createSequenceConstraintFactory( graph: LayoutGraph ):ISequenceConstraintFactory
/**
 * Creates and registers a sequencer constraint factory for an [IGraph].
 * @param [graph] The graph.
 * @return the sequence constraint factory
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-defaultmethod-createSequenceConstraintFactory(IGraph)">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
   fun createSequenceConstraintFactory( graph: IGraph ):ISequenceConstraintFactory
/**
 * Disposes of the core layout algorithm.
 * @param [graph] the input graph
 * @param [coreLayouter] the given core layout algorithm instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-disposeCoreLayout">Online Documentation</a>
 */
 open protected   fun disposeCoreLayout( graph: LayoutGraph ,
 coreLayouter: HierarchicLayoutCore )
/**
 * Returns the mirror mask of the [orientation layouter][MultiStageLayout.orientationLayout].
 * @return the mirror mask
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-getMirrorMode">Online Documentation</a>
 */
 open protected   fun getMirrorMode():MirrorModes

companion object : ClassMetadata<HierarchicLayout> {
/**
 * A data provider key for associating alternative paths for edges connecting to groups, group content or folder nodes.
 * @see [ALTERNATIVE_GROUP_BOUNDS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23ALTERNATIVE_EDGE_PATH_DP_KEY">Online Documentation</a>
 */
 val ALTERNATIVE_EDGE_PATH_DP_KEY: EdgeDpKey<YPointPath>
/**
 * A data provider key for associating an alternative bounds with the collapsed/expanded group.
 * @see [ALTERNATIVE_EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23ALTERNATIVE_GROUP_BOUNDS_DP_KEY">Online Documentation</a>
 */
 val ALTERNATIVE_GROUP_BOUNDS_DP_KEY: NodeDpKey<YRectangle>
/**
 * A data provider key for specifying the bus to which an edge belongs to.
 * @see [BusDescriptor]
 * @see [BusDescriptor.PLACE_BEFORE_BUS_DP_KEY]
 * @see [BusDescriptor.ROOT_OFFSET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23BUS_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val BUS_DESCRIPTOR_DP_KEY: EdgeDpKey<BusDescriptor>
/**
 * A data provider key for defining the priority of critical edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23CRITICAL_EDGE_PRIORITY_DP_KEY">Online Documentation</a>
 */
 val CRITICAL_EDGE_PRIORITY_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying individual crossing costs of the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23EDGE_CROSSING_COST_DP_KEY">Online Documentation</a>
 */
 val EDGE_CROSSING_COST_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the directedness of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23EDGE_DIRECTEDNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_DIRECTEDNESS_DP_KEY: EdgeDpKey<EdgeDirectedness>
/**
 * A data provider key for specifying the thickness of the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23EDGE_THICKNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_THICKNESS_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for marking folder nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23FOLDER_NODES_DP_KEY">Online Documentation</a>
 */
 val FOLDER_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying individual crossing costs for vertical borders of group nodes.
 * @see [EDGE_CROSSING_COST_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23GROUP_BORDER_CROSSING_COST_DP_KEY">Online Documentation</a>
 */
 val GROUP_BORDER_CROSSING_COST_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for specifying incremental hints.
 * @see [HierarchicLayoutCore.INCREMENTAL_HINTS_DP_KEY]
 * @see [IIncrementalHintsFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23INCREMENTAL_HINTS_DP_KEY">Online Documentation</a>
 */
 val INCREMENTAL_HINTS_DP_KEY: GraphObjectDpKey<IncrementalHint>
/**
 * A data provider key for storing the constraint graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23LAYER_CONSTRAINTS_MEMENTO_DP_KEY">Online Documentation</a>
 */
 val LAYER_CONSTRAINTS_MEMENTO_DP_KEY: GraphDpKey<LayerConstraintsMemento>
/**
 * A data acceptor key for publishing the layer IDs for all nodes in the graph.
 * @see [HierarchicLayoutCore.LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23LAYER_INDEX_DP_KEY">Online Documentation</a>
 */
 val LAYER_INDEX_DP_KEY: NodeDpKey<Int>
/**
 * A data provider key for storing the constraint graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23SEQUENCE_CONSTRAINTS_MEMENTO_DP_KEY">Online Documentation</a>
 */
 val SEQUENCE_CONSTRAINTS_MEMENTO_DP_KEY: GraphDpKey<SequenceConstraintsMemento>
/**
 * A data acceptor key for publishing the index inside their layer for all nodes in the graph.
 * @see [HierarchicLayoutCore.SEQUENCE_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23SEQUENCE_INDEX_DP_KEY">Online Documentation</a>
 */
 val SEQUENCE_INDEX_DP_KEY: NodeDpKey<Int>
/**
 * A data provider key for specifying custom subcomponents of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23SUBCOMPONENT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val SUBCOMPONENT_DESCRIPTOR_DP_KEY: NodeDpKey<HierarchicLayoutSubcomponentDescriptor>
/**
 * A data provider key for defining swimlanes for the nodes.
 * @see [HierarchicLayoutCore.SWIMLANE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23SWIMLANE_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val SWIMLANE_DESCRIPTOR_DP_KEY: NodeDpKey<SwimlaneDescriptor>
/**
 * A data provider key for marking tabular group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23TABULAR_GROUPS_DP_KEY">Online Documentation</a>
 */
 val TABULAR_GROUPS_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying orderings of child nodes of a tabular group node.
 * @see [TABULAR_GROUPS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23TABULAR_GROUP_CHILD_COMPARER_DP_KEY">Online Documentation</a>
 */
 val TABULAR_GROUP_CHILD_COMPARER_DP_KEY: NodeDpKey<IComparer<Any>>
/**
 * A data provider key for specifying whether or not the ports of edges incident to a specific group node should be uniformly distributed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23UNIFORM_PORT_ASSIGNMENT_GROUPS_DP_KEY">Online Documentation</a>
 */
 val UNIFORM_PORT_ASSIGNMENT_GROUPS_DP_KEY: NodeDpKey<Boolean>
/**
 * Returns the corresponding original edge instance for a given edge.
 * @receiver the edge for which the original input edge is retrieved
 * @param [layoutDataProvider] the layout data provider holding layout information of the hierarchical layout
 * @return the original input edge corresponding to the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayout%23HierarchicLayout-method-getOriginalEdge">Online Documentation</a>
 */
 final   fun Edge.getOriginalEdge( layoutDataProvider: ILayoutDataProvider ):Edge
}
}

inline fun HierarchicLayout(
    block: HierarchicLayout.() -> Unit
): HierarchicLayout {
    return HierarchicLayout()
        .apply(block)
}
