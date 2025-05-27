// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Point
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Id
import yfiles.lang.Predicate
import yfiles.lang.YObject
import yfiles.view.IGraphSelection

/**
 * Clipboard implementation for [IGraph] instances.
 * @see [IClipboardHelper]
 * @see [cut]
 * @see [onCopy]
 * @see [pasteAndSelect]
 * @see [clipboardGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard">Online Documentation</a>
 * 
 * @constructor Creates a new initially empty clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-constructor-GraphClipboard">Online Documentation</a>
 */
external open class GraphClipboard  () : YObject, IEventDispatcher {

/**
 * Gets the clipboard context for the current clipboard operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23clipboardContext">Online Documentation</a>
 */
protected final val clipboardContext: IGraphClipboardContext?
/**
 * Gets or sets the graph that contains the clipboard's contents.
 * @throws ArgumentError If `value` is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23clipboardGraph">Online Documentation</a>
 */
final var clipboardGraph: IGraph
/**
 * Gets or sets the type of items that can be copied and pasted at all using the clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23copyItems">Online Documentation</a>
 */
final var copyItems: GraphItemTypes
/**
 * Gets or sets the type of items that depend on other elements but should automatically be copied implicitly to the clipboard if all elements that it depends on are explicitly selected for copying.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23dependentCopyItems">Online Documentation</a>
 */
final var dependentCopyItems: GraphItemTypes
/**
 * Gets or sets the [GraphCopier] instance that will be used to duplicate elements inside the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23duplicateCopier">Online Documentation</a>
 */
final var duplicateCopier: GraphCopier
/**
 * Gets whether the clipboard graph is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23empty">Online Documentation</a>
 */
open val empty: Boolean
/**
 * Gets or sets the [GraphCopier] instance that will be used to copy the graph from the clipboard to the target graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23fromClipboardCopier">Online Documentation</a>
 */
final var fromClipboardCopier: GraphCopier
/**
 * Gets or sets the [IClipboardIdProvider] used by this instance to provide IDs for copied items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23idProvider">Online Documentation</a>
 */
final var idProvider: IClipboardIdProvider
/**
 * Gets or sets whether to paste edges whose source or target node was selected when copying to the clipboard while the other node was not.
 * 
 * The default is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ignoreEdgesWithOneNode">Online Documentation</a>
 */
final var ignoreEdgesWithOneNode: Boolean
/**
 * Gets or sets the type of items that can be copied and pasted independently of their owning element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23independentCopyItems">Online Documentation</a>
 */
final var independentCopyItems: GraphItemTypes
/**
 * Gets or sets whether or not nodes should be automatically put into a group node and if so how this group will be determined.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23parentNodeDetection">Online Documentation</a>
 */
final var parentNodeDetection: ParentNodeDetectionModes
/**
 * Gets or sets a vector that will be used to move nodes and bends by after they have been pasted to the target graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23pasteDelta">Online Documentation</a>
 */
final var pasteDelta: Point
/**
 * Gets or sets the [GraphCopier] instance that will be used to copy the graph to the clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23toClipboardCopier">Online Documentation</a>
 */
final var toClipboardCopier: GraphCopier
/**
 * Clears the clipboard's contents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Copies the elements indicated by the filter to the clipboard graph.
 * @param [sourceGraph] The graph to copy the contents from.
 * @param [filter] The filter to apply to the source graph's elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-copy">Online Documentation</a>
 */
 open   fun copy( sourceGraph: IGraph ,
 filter: Predicate<IModelItem>? )
/**
 * Creates a predicate that is based upon the outcome of the [IClipboardHelper.shouldCopy] method that can be found in the [ILookup.lookup] of the provided [IModelItem].
 * @return A predicate that uses [IClipboardHelper.shouldCopy].
 * @see [onCopy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createClipBoardHelperCopyFilter">Online Documentation</a>
 */
 open   fun createClipBoardHelperCopyFilter():Predicate<IModelItem>
/**
 * Creates a predicate that is based upon the outcome of the [IClipboardHelper.shouldCut] method that can be found in the [ILookup.lookup] of the provided [IModelItem].
 * @return A predicate that uses [IClipboardHelper.shouldCut].
 * @see [cut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createClipBoardHelperCutFilter">Online Documentation</a>
 */
 open   fun createClipBoardHelperCutFilter():Predicate<IModelItem>
/**
 * Creates a predicate that is based upon the outcome of the [IClipboardHelper.shouldPaste] method that can be found in the [ILookup.lookup] of the provided [IModelItem].
 * @return A predicate that uses [IClipboardHelper.shouldPaste].
 * @see [cut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createClipBoardHelperPasteFilter">Online Documentation</a>
 */
 open   fun createClipBoardHelperPasteFilter():Predicate<IModelItem>
/**
 * Creates the graph used for the clipboard.
 * @return A new readily configured [DefaultGraph] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createClipboardGraph">Online Documentation</a>
 */
 open protected   fun createClipboardGraph():IGraph
/**
 * Factory method that creates the context for the upcoming calls to the [IClipboardHelper] methods.
 * @param [sourceGraph] The source graph of the operation.
 * @param [targetGraph] The target graph of the operation.
 * @return A context that has the properties configured according to the parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createContext">Online Documentation</a>
 */
 open protected   fun createContext( sourceGraph: IGraph ,
 targetGraph: IGraph ):IGraphClipboardContext
/**
 * Creates the default [IClipboardIdProvider] used by this instance to provide IDs for copied items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createDefaultClipboardIdProvider">Online Documentation</a>
 */
 open protected   fun createDefaultClipboardIdProvider():IClipboardIdProvider
/**
 * Creates a predicate for use in the [onCopy] method.
 * @param [selection] The selection model to base the filter on.
 * @param [graph] The graph to use for determining adjacency.
 * @return A predicate that filters subgraph induced by the selection of nodes and restricted by an optional [IClipboardHelper.shouldCopy] predicate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createDefaultCopyFilter">Online Documentation</a>
 */
 open   fun createDefaultCopyFilter( selection: IGraphSelection ,
 graph: IGraph ):Predicate<IModelItem>
/**
 * Creates a predicate for use in the [cut] method.
 * @param [selection] The selection model to base the filter on.
 * @param [graph] The graph to use for determining adjacency.
 * @return A predicate that filters subgraph induced by the selection of nodes and restricted by an optional [IClipboardHelper.shouldCut] predicate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createDefaultCutFilter">Online Documentation</a>
 */
 open   fun createDefaultCutFilter( selection: IGraphSelection ,
 graph: IGraph ):Predicate<IModelItem>
/**
 * Creates a predicate for use in the [duplicate] method.
 * 
 * By default this method uses the same filter implementation as [createDefaultCopyFilter]: This filter uses two predicates to decide whether a graph item will be duplicated. The base set of items specified by this filter is induced by the [createSelectionFilter]. Optionally, this set can be restricted further by an [IClipboardHelper.shouldCopy] predicate. If such a predicate returns `false` for the item itself or any item this item depends on, then the item will not be copied. Items without such a predicate are handled solely according to their selection state.
 * @param [selection] The selection model to base the filter on.
 * @param [graph] The graph to use for determining adjacency.
 * @return A predicate that filters subgraph induced by the selection of nodes and restricted by an optional [IClipboardHelper.shouldCopy] predicate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createDefaultDuplicateFilter">Online Documentation</a>
 */
 open   fun createDefaultDuplicateFilter( selection: IGraphSelection ,
 graph: IGraph ):Predicate<IModelItem>
/**
 * Factory method that creates the [duplicateCopier].
 * @return A new [GraphCopier] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createDuplicateCopier">Online Documentation</a>
 */
 open protected   fun createDuplicateCopier():GraphCopier
/**
 * Factory method that creates the [fromClipboardCopier].
 * @return A new [GraphCopier] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createFromClipboardCopier">Online Documentation</a>
 */
 open protected   fun createFromClipboardCopier():GraphCopier
/**
 * Creates a predicate for use in the [cut] and [onCopy] methods.
 * @param [selection] The selection model to base the filter on.
 * @param [graph] The graph to use for determining adjacency.
 * @return A predicate that filters subgraph induced by the selection of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createSelectionFilter">Online Documentation</a>
 */
 open   fun createSelectionFilter( selection: IGraphSelection ,
 graph: IGraph ):Predicate<IModelItem>
/**
 * Factory method that creates the [toClipboardCopier].
 * @return A new [GraphCopier] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createToClipboardCopier">Online Documentation</a>
 */
 open protected   fun createToClipboardCopier():GraphCopier
/**
 * Cuts the items indicated by `filter` to the clipboard and removes them from the graph.
 * @param [sourceGraph] The graph to cut the items from.
 * @param [filter] The filter to use.
 * @see [createSelectionFilter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-cut">Online Documentation</a>
 */
 open   fun cut( sourceGraph: IGraph ,
 filter: Predicate<IModelItem>? )
/**
 * Duplicates the elements indicated by the filter.
 * @param [context] The current [IInputModeContext].
 * @param [sourceGraph] The graph whose elements should be duplicated.
 * @param [filter] A predicate which returns `true` for elements which should be duplicated.
 * @param [elementDuplicated] An element copied callback which gets invoked for each element which has been duplicated. The two parameters passed into the callback are guaranteed to be part of the `sourceGraph`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-duplicate">Online Documentation</a>
 */
 open   fun duplicate( context: IInputModeContext? ,
 sourceGraph: IGraph ,
 filter: Predicate<IModelItem>? ,
 elementDuplicated: ElementCopiedCallback?  = definedExternally)
/**
 * Retrieves the [IClipboardHelper] instance associated with the given item.
 * @param [item] The item to find the clipboard helper for.
 * @return An instance or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getClipboardHelper">Online Documentation</a>
 */
 open protected   fun <T : IModelItem>getClipboardHelper( item: T ):IClipboardHelper<T, *>?
/**
 * Gets a folding state of an edge for a given [FoldingEdgeStateId].
 * @param [edge] The edge to get the folding state for.
 * @param [id] The original [FoldingEdgeStateId] to get the folding state for. Passing `null` will return the folding state which was visible when the edge was copied into the clipboard.
 * @return The folding state which is mapped to the given `id`. May be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getFoldingEdgeState">Online Documentation</a>
 */
 open protected   fun getFoldingEdgeState( edge: IEdge ,
 id: FoldingEdgeStateId? ):IEdge?
/**
 * Returns the [ID][IClipboardIdProvider.getId] which is linked with the given clipboard item.
 * @param [clipboardItem] An [IModelItem] which lives in the clipboard graph.
 * @return The [IModelItem] which lives in the original graph. The ID which represents the item from which `clipboardItem` has originally been copied into the clipboard. [idProvider]'s [IClipboardIdProvider.getItem] can be used to retrieve the original item. Note that both, the returned ID as well as the item returned by [IClipboardIdProvider.getItem] might be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getId">Online Documentation</a>
 */
 final protected   fun getId( clipboardItem: IModelItem ):Id?
/**
 * Gets a [ILabelModelParameter] for the given `label` to be placed at the given `newOwner`.
 * @param [copier] The [GraphCopier] whose [GraphCopier.copyLabelLayoutParameter] method can be used to copy the existing parameter.
 * @param [graph] The [IGraph] whose [IGraph.nodeDefaults] or [IGraph.edgeDefaults] can be used to create a new parameter.
 * @param [label] The label to be copied.
 * @param [newOwner] The new owner for the label.
 * @return An [ILabelModelParameter] for the copied label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getLabelLayoutParameter">Online Documentation</a>
 */
 open protected   fun getLabelLayoutParameter( copier: GraphCopier ,
 graph: IGraph ,
 label: ILabel ,
 newOwner: ILabelOwner ):ILabelModelParameter
/**
 * Retrieves the memento associated with an item in the clipboard graph that has been stored with the item during [onElementCopied] and [onElementCut].
 * @param [clipboardItem] The item in the clipboard graph.
 * @return The object returned by the [IClipboardHelper] methods or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getMemento">Online Documentation</a>
 */
 final   fun getMemento( clipboardItem: IModelItem ):Any?
/**
 * Gets a [IPortLocationModelParameter] for the given `originalPort` to be placed at the given `newOwner`.
 * @param [copier] The [GraphCopier] whose [GraphCopier.copyPortLocationParameter] method can be used to copy the existing parameter.
 * @param [graph] The [IGraph] whose [IGraph.nodeDefaults] or [IGraph.edgeDefaults] can be used to create a new parameter.
 * @param [originalPort] The port to be copied.
 * @param [newOwner] The new owner for the port.
 * @return An [IPortLocationModelParameter] for the copied port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getPortLocationParameter">Online Documentation</a>
 */
 open protected   fun getPortLocationParameter( copier: GraphCopier ,
 graph: IGraph ,
 originalPort: IPort ,
 newOwner: IPortOwner ):IPortLocationModelParameter
/**
 * Provides an [IEdge] where the given `clipboardBend` can be added to.
 * @param [clipboardBend] The bend to be copied from the [clipboardGraph].
 * @return An [IEdge] for the bend to be added to or `null` if the bend should not be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetEdge">Online Documentation</a>
 */
 open protected   fun getTargetEdge( clipboardBend: IBend ):IEdge?
/**
 * Provides an [ILabelOwner] where the given `clipboardLabel` can be added to.
 * @param [clipboardLabel] The label to be copied from the [clipboardGraph].
 * @return An [ILabelOwner] for the label to be added to or `null` if the label should not be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetLabeledItem">Online Documentation</a>
 */
 open protected   fun getTargetLabeledItem( clipboardLabel: ILabel ):ILabelOwner?
/**
 * Provides a parent group node for the given `clipboardNode`.
 * @param [clipboardNode] The node to be copied from the [clipboardGraph].
 * @return The new parent group of the node or `null` if the node should be placed at the root of the hierarchy or if the graph is not grouped.
 * @see [parentNodeDetection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetNode">Online Documentation</a>
 */
 open protected   fun getTargetNode( clipboardNode: INode ):INode?
/**
 * Provides an [IPort] where the given `clipboardEdge` can be added to.
 * @param [clipboardEdge] The edge to be copied from the [clipboardGraph].
 * @param [atSource] Whether to look for a source port.
 * @return An [IPort] for the edge to be added to or `null` if the edge should not be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetPort">Online Documentation</a>
 */
 open protected   fun getTargetPort( clipboardEdge: IEdge ,
 atSource: Boolean ):IPort?
/**
 * Provides an [IPortOwner] where the given `clipboardPort` can be added to.
 * @param [clipboardPort] The port to be copied from the [clipboardGraph].
 * @return An [IPortOwner] for the port to be added to or `null` if the port should not be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetPortOwner">Online Documentation</a>
 */
 open protected   fun getTargetPortOwner( clipboardPort: IPort ):IPortOwner?
/**
 * Whether the given `item` is a "dummy" item which should not be pasted.
 * @param [item] The item to test.
 * @return `true` if the item is a "dummy" item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-isDummy">Online Documentation</a>
 */
 final   fun isDummy( item: IModelItem ):Boolean
/**
 * Calls [GraphCopier.copy] on the current [toClipboardCopier] instance or [fromClipboardCopier] instance, depending on whether the `targetGraph` is the [clipboardGraph] instance.
 * @param [sourceGraph] The source graph to pass to [GraphCopier.copy]
 * @param [filter] The predicate to pass on.
 * @param [targetGraph] The target graph to pass on.
 * @param [targetRootNode] The node to use as the root node in the grouped `targetGraph`.
 * @param [elementCopiedCallback] The delegate to pass on. For each element that is copied during the operation to the clipboard, this callback will be passed the original and the copy of the item. In case the `sourceGraph` is a [folding view graph][FoldingManager.views] both elements are passed as [master][FoldingManager.masterGraph] elements or [folding state elements][FoldingManager.getFolderNodeState] if a master element does not exist.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onCopy">Online Documentation</a>
 */
 open protected   fun onCopy( sourceGraph: IGraph ,
 filter: Predicate<IModelItem> ,
 targetGraph: IGraph ,
 targetRootNode: INode? ,
 elementCopiedCallback: ElementCopiedCallback? )
/**
 * A callback that will be invoked for each item that has been copied into the clipboard graph in response to a [onCopy] operation.
 * @param [original] The original element from the source graph instance. If the source graph is a managed folding view, this is always a master item.
 * @param [copy] The copy from the clipboard graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onElementCopied">Online Documentation</a>
 */
 open protected   fun onElementCopied( original: IModelItem ,
 copy: IModelItem )
/**
 * A callback function that will be invoked for each item that has been copied into the clipboard graph in response to a [cut] operation.
 * @param [original] The original element from the source graph instance. If the source graph is a managed folding view, this is always a master item.
 * @param [copy] The copy from the clipboard graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onElementCut">Online Documentation</a>
 */
 open protected   fun onElementCut( original: IModelItem ,
 copy: IModelItem )
/**
 * A callback function that will be invoked for each item that has been pasted into the target graph in response to a [pasteAndSelect] operation.
 * @param [original] The original element from the clipboard graph instance. If the target graph is a managed folding view, this is always a master item.
 * @param [copy] The copy from the target graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onElementPasted">Online Documentation</a>
 */
 open protected   fun onElementPasted( original: IModelItem ,
 copy: IModelItem )
/**
 * Calls [GraphCopier.copy] on the current [fromClipboardCopier] instance, depending on whether the `targetGraph` is the [clipboardGraph] instance.
 * @param [sourceGraph] The source graph to pass to [GraphCopier.copy]
 * @param [filter] The predicate to pass on.
 * @param [targetGraph] The target graph to pass on.
 * @param [targetRootNode] The node to use as the root node in the grouped `targetGraph`.
 * @param [elementCopiedCallback] The delegate to pass on. For each element that is copied during the operation to the clipboard, this callback will be passed the original and the copy of the item. In case the `targetGraph` is a [folding view graph][FoldingManager.views] the original element is passed as [master][FoldingManager.masterGraph] elements or [folding state elements][FoldingManager.getFolderNodeState] if a master element does not exist. The copied element is always part of the `targetGraph`.
 * @param [targetFilter] This predicate is used to determine which [INode]s and [IEdge]s can be used as targets for paste operations, e.g. if a labels or ports are copied without their owners. If `null` all model items can be used as targets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onPaste">Online Documentation</a>
 */
 open protected   fun onPaste( sourceGraph: IGraph ,
 filter: Predicate<IModelItem>? ,
 targetGraph: IGraph ,
 targetRootNode: INode? ,
 elementCopiedCallback: ElementCopiedCallback? ,
 targetFilter: Predicate<IModelItem>? )
/**
 * Pastes the contents from the [clipboardGraph] to the `targetGraph` after applying a `filter`.
 * @param [targetGraph] The graph to paste the contents in.
 * @param [filter] The filter to apply to the clipboard graph.
 * @param [elementPasted] The callback to use for each element that has been pasted. For each element that is copied during the operation to the clipboard, this callback will be passed the original and the copy of the item. In case the `targetGraph` is a [folding view graph][FoldingManager.views] the original element is passed as [master][FoldingManager.masterGraph] elements or [folding state elements][FoldingManager.getFolderNodeState] if a master element does not exist. The copied element is always part of the `targetGraph`.
 * @param [targetFilter] A filter which returns `true` for model items which can be used as target for clipboard items which need an owner (e.g. [ILabel]s which were copied without their owner). If `null` all model items can be used as targets.
 * @param [context] A valid input mode context. Passing a valid input mode context is required for keeping orthogonal edges at group nodes whose size might be adjusted after the paste operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-paste">Online Documentation</a>
 */
 open   fun paste( targetGraph: IGraph ,
 filter: Predicate<IModelItem>?  = definedExternally,
 elementPasted: ElementCopiedCallback?  = definedExternally,
 targetFilter: Predicate<IModelItem>?  = definedExternally,
 context: IInputModeContext?  = definedExternally)
/**
 * Pastes the [clipboardGraph]'s contents into the `targetGraph`, selecting all pasted elements.
 * @param [targetGraph] The graph to paste into.
 * @param [selection] The selection model to set the selection on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-pasteAndSelect">Online Documentation</a>
 */
 open   fun pasteAndSelect( targetGraph: IGraph ,
 selection: IGraphSelection )
/**
 * Removes elements from the graph based on a predicate.
 * @param [sourceGraph] The graph to remove elements from.
 * @param [predicate] The predicate that decides which elements to remove.
 * @see [cut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-removeElements">Online Documentation</a>
 */
 open protected   fun removeElements( sourceGraph: IGraph ,
 predicate: Predicate<IModelItem> )
/**
 * Occurs before the [cut] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCutting">Online Documentation</a>
 */
fun addElementsCuttingListener(listener: EventHandler1<EventArgs>)
fun removeElementsCuttingListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs before the [copy] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCopying">Online Documentation</a>
 */
fun addElementsCopyingListener(listener: EventHandler1<EventArgs>)
fun removeElementsCopyingListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs before the [paste] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsPasting">Online Documentation</a>
 */
fun addElementsPastingListener(listener: EventHandler1<EventArgs>)
fun removeElementsPastingListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs before the [duplicate] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsDuplicating">Online Documentation</a>
 */
fun addElementsDuplicatingListener(listener: EventHandler1<EventArgs>)
fun removeElementsDuplicatingListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [cut] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCut">Online Documentation</a>
 */
fun addElementsCutListener(listener: EventHandler1<EventArgs>)
fun removeElementsCutListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [copy] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCopied">Online Documentation</a>
 */
fun addElementsCopiedListener(listener: EventHandler1<EventArgs>)
fun removeElementsCopiedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [paste] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsPasted">Online Documentation</a>
 */
fun addElementsPastedListener(listener: EventHandler1<EventArgs>)
fun removeElementsPastedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [duplicate] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsDuplicated">Online Documentation</a>
 */
fun addElementsDuplicatedListener(listener: EventHandler1<EventArgs>)
fun removeElementsDuplicatedListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<GraphClipboard> {
/**
 * Creates an induced predicate from `coreFilter` for use in the [cut] and [onCopy] methods that takes dependent items into account.
 * @param [coreFilter] The core predicate for the base set of elements.
 * @param [graph] The graph to use for determining adjacency.
 * @param [restrictive] Whether to create a restriction or extension for the `coreFilter` predicate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createWrappedFilter">Online Documentation</a>
 */
 final   fun createWrappedFilter( coreFilter: Predicate<IModelItem> ,
 graph: IGraph ,
 restrictive: Boolean ):Predicate<IModelItem>
/**
 * Whether the given `item` exists in a folding state of its `owner`.
 * @param [owner] The owner of the given item.
 * @param [item] An [ILabel], [IPort], or [IBend].
 * @return `true` if the given item exists in a folding state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-isFoldingStateElement">Online Documentation</a>
 */
 final protected   fun isFoldingStateElement( owner: IModelItem ,
 item: IModelItem? ):Boolean
}
}

inline fun GraphClipboard(
    block: GraphClipboard.() -> Unit
): GraphClipboard {
    return GraphClipboard()
        .apply(block)
}

inline val  GraphClipboard.notEmpty: Boolean
    get() = !empty

/**
 * Occurs before the [cut] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCutting">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsCuttingHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCuttingListener(listener)
    return { removeElementsCuttingListener(listener) }
}
/**
 * Occurs before the [copy] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCopying">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsCopyingHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCopyingListener(listener)
    return { removeElementsCopyingListener(listener) }
}
/**
 * Occurs before the [paste] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsPasting">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsPastingHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsPastingListener(listener)
    return { removeElementsPastingListener(listener) }
}
/**
 * Occurs before the [duplicate] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsDuplicating">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsDuplicatingHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsDuplicatingListener(listener)
    return { removeElementsDuplicatingListener(listener) }
}
/**
 * Occurs when the [cut] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCut">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsCutHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCutListener(listener)
    return { removeElementsCutListener(listener) }
}
/**
 * Occurs when the [copy] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsCopied">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsCopiedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCopiedListener(listener)
    return { removeElementsCopiedListener(listener) }
}
/**
 * Occurs when the [paste] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsPasted">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsPastedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsPastedListener(listener)
    return { removeElementsPastedListener(listener) }
}
/**
 * Occurs when the [duplicate] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ElementsDuplicated">Online Documentation</a>
 */
inline fun  GraphClipboard.addElementsDuplicatedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsDuplicatedListener(listener)
    return { removeElementsDuplicatedListener(listener) }
}
