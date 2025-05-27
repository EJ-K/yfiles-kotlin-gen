// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.GraphItemTypes
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.GraphComponent
import yfiles.view.IGraphSelection

/**
 * An [IInputMode] that can [navigate][moveTo] an [IGraph] displayed in a [graphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NavigationInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-constructor-NavigationInputMode">Online Documentation</a>
 */
external open class NavigationInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets a value that determines whether it is allowed to collapse group nodes via the [ICommand.COLLAPSE_GROUP].
 * 
 * The default value is `true`.
 * @see [collapseGroup]
 * @see [shouldCollapseGroup]
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowCollapseGroup">Online Documentation</a>
 */
final var allowCollapseGroup: Boolean
/**
 * Gets or sets a value that determines whether it is allowed to [enter group nodes][enterGroup] via the [ICommand.ENTER_GROUP].
 * 
 * The default value is `true`.
 * @see [shouldEnterGroup]
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowEnterGroup">Online Documentation</a>
 */
final var allowEnterGroup: Boolean
/**
 * Gets or sets a value that determines whether it is allowed to [exit the current group node][exitGroup] via the [ICommand.EXIT_GROUP].
 * 
 * The default value is `true`.
 * @see [shouldExitGroup]
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowExitGroup">Online Documentation</a>
 */
final var allowExitGroup: Boolean
/**
 * Gets or sets a value that determines whether it is allowed to [expand group nodes][expandGroup] via the [ICommand.EXPAND_GROUP].
 * 
 * The default value is `true`.
 * @see [shouldExpandGroup]
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowExpandGroup">Online Documentation</a>
 */
final var allowExpandGroup: Boolean
/**
 * Gets or sets the location that should be kept fixed if toggling a group node state.
 * @see [expandGroup]
 * @see [collapseGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23autoGroupNodeAlignmentPolicy">Online Documentation</a>
 */
final var autoGroupNodeAlignmentPolicy: NodeAlignmentPolicy
/**
 * Gets the list of commands that are available in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23availableCommands">Online Documentation</a>
 */
final val availableCommands: ICollection<out ICommand<*>>
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets a value that determines whether [CanvasComponent.fitContent][yfiles.view.CanvasComponent.fitContent] or the [ICommand.FIT_CONTENT] should be triggered after a group navigation action.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23fitContentAfterGroupActions">Online Documentation</a>
 */
final var fitContentAfterGroupActions: Boolean
/**
 * Gets or sets the graph this mode operates on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graph">Online Documentation</a>
 */
final val graph: IGraph?
/**
 * Gets or sets the [graphComponent] this mode acts on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graphComponent">Online Documentation</a>
 */
final var graphComponent: GraphComponent?
/**
 * Gets or sets the [IGraphSelection] this mode operates on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graphSelection">Online Documentation</a>
 */
final val graphSelection: IGraphSelection?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the item types that can be navigated to by this mode.
 * @see [shouldNavigateTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23navigableItems">Online Documentation</a>
 */
final var navigableItems: GraphItemTypes
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets a value determining whether a node that has been focused or selected with a keyboard gesture should be made visible by adjusting the viewport.
 * 
 * The default value is `true`.
 * @see [CanvasComponent.ensureVisible][yfiles.view.CanvasComponent.ensureVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23scrollToSelection">Online Documentation</a>
 */
final var scrollToSelection: Boolean
/**
 * Gets the types of the items that should be selectable by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23selectableItems">Online Documentation</a>
 */
final var selectableItems: GraphItemTypes
/**
 * Gets or sets a value indicating whether to use the [GraphComponent.currentItem] as a fallback for the commands if no item is provided in the parameter and the current selection is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23useCurrentItemForCommands">Online Documentation</a>
 */
final var useCurrentItemForCommands: Boolean
/**
 * Gets or sets a value indicating whether navigating the graph with the arrow keys interprets the direction in view coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * Adjusts the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] to encompass all elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-adjustContentRect">Online Documentation</a>
 */
 open protected   fun adjustContentRect()
/**
 * Adjust the group node location according to the value of [autoGroupNodeAlignmentPolicy].
 * @param [collapse] `true` iff the node has just been collapsed.
 * @param [groupNode] The node that has changed its state.
 * @param [expandedSize] The size of the group node when it is expanded.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-adjustGroupNodeLocation">Online Documentation</a>
 */
 open protected   fun adjustGroupNodeLocation( collapse: Boolean ,
 groupNode: INode ,
 expandedSize: Rect?  = definedExternally)
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Clears the selection in the [graphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-clearSelection">Online Documentation</a>
 */
 open   fun clearSelection()
/**
 * [Collapses][yfiles.graph.IFoldingView.collapse] the given group node to hide the contents of the group node from this [IFoldingView][yfiles.graph.IFoldingView].
 * @param [groupNode] The group node to collapse.
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see [allowCollapseGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-collapseGroup">Online Documentation</a>
 */
 open   fun collapseGroup( groupNode: INode )
/**
 * Performs [collapseGroup] for all [IGraphSelection.selectedNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-collapseSelection">Online Documentation</a>
 */
 open   fun collapseSelection()
/**
 * This method allows for entering a group node so that the currently displayed [IFoldingView][yfiles.graph.IFoldingView]'s [IFoldingView.localRoot][yfiles.graph.IFoldingView.localRoot] will be reset to the provided node.
 * @param [node] The node that needs to be either part of the current graph, or part of the [FoldingManager.masterGraph][yfiles.graph.FoldingManager.masterGraph].
 * @see [shouldEnterGroup]
 * @see [allowEnterGroup]
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-enterGroup">Online Documentation</a>
 */
 open   fun enterGroup( node: INode )
/**
 * Performs [enterGroup] for the first valid [IGraphSelection.selectedNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-enterSelectedGroup">Online Documentation</a>
 */
 open   fun enterSelectedGroup()
/**
 * Exits the current [IFoldingView.localRoot][yfiles.graph.IFoldingView.localRoot] of the currently displayed [view][yfiles.graph.IFoldingView] and shows the contents of the parent container.
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see [allowExitGroup]
 * @see [shouldExitGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-exitGroup">Online Documentation</a>
 */
 open   fun exitGroup()
/**
 * [Expands][yfiles.graph.IFoldingView.expand] the given group node to show the contents of the collapsed group node in this [IFoldingView][yfiles.graph.IFoldingView].
 * @param [groupNode] The group node to expand
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see [allowExpandGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-expandGroup">Online Documentation</a>
 */
 open   fun expandGroup( groupNode: INode )
/**
 * Performs [expandGroup] for all [IGraphSelection.selectedNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-expandSelection">Online Documentation</a>
 */
 open   fun expandSelection()
/**
 * Moves the focus into the given direction, extending the selection to the new element.
 * @param [direction] The direction to move the focus and extend the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-extendSelectionTo">Online Documentation</a>
 */
 open   fun extendSelectionTo( direction: MoveFocusDirection )
/**
 * Determines the nearest item in the given `direction`.
 * @param [context] The current input mode context.
 * @param [startLocation] The reference location for the gesture.
 * @param [direction] The direction for the move action.
 * @param [itemsToCheck] The items that should be considered.
 * @return The nearest item in `direction` or `null` if no suitable item can be determined.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-findNearestItem">Online Documentation</a>
 */
 open protected   fun findNearestItem( context: IInputModeContext ,
 startLocation: Point ,
 direction: MoveFocusDirection ,
 itemsToCheck: IEnumerable<IModelItem> ):IModelItem?
/**
 * Determines the next item when a navigation command is executed.
 * @param [context] The current input mode context.
 * @param [direction] The direction of the command.
 * @return The next item in `direction`, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-findNextItem">Online Documentation</a>
 */
 open protected   fun findNextItem( context: IInputModeContext ,
 direction: MoveFocusDirection ):IModelItem?
/**
 * Adjusts the viewport to fully encompass the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-fitContent">Online Documentation</a>
 */
 open protected   fun fitContent()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Moves the focus into the given direction, not changing the current selection.
 * @param [direction] The direction to move the focus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-moveFocusTo">Online Documentation</a>
 */
 open   fun moveFocusTo( direction: MoveFocusDirection )
/**
 * Moves the focus into the given direction, setting the selection to the new element.
 * @param [direction] The direction to move the focus and selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-moveTo">Online Documentation</a>
 */
 open   fun moveTo( direction: MoveFocusDirection )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Raises the [GroupCollapsed] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupCollapsed">Online Documentation</a>
 */
 open protected   fun onGroupCollapsed( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupCollapsing] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupCollapsing">Online Documentation</a>
 */
 open protected   fun onGroupCollapsing( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupEntered] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupEntered">Online Documentation</a>
 */
 open protected   fun onGroupEntered( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupEntering] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupEntering">Online Documentation</a>
 */
 open protected   fun onGroupEntering( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupExited] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExited">Online Documentation</a>
 */
 open protected   fun onGroupExited( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupExiting] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExiting">Online Documentation</a>
 */
 open protected   fun onGroupExiting( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupExpanded] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExpanded">Online Documentation</a>
 */
 open protected   fun onGroupExpanded( event: ItemEventArgs<INode> )
/**
 * Raises the [GroupExpanding] event.
 * @param [event] The [ItemEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExpanding">Online Documentation</a>
 */
 open protected   fun onGroupExpanding( event: ItemEventArgs<INode> )
/**
 * Actually sets the current item property.
 * @param [graphComponent] The [graphComponent] to set the current item of.
 * @param [item] The item to set.
 * @return Whether the operation was actually performed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onSetCurrentItem">Online Documentation</a>
 */
 open protected   fun onSetCurrentItem( graphComponent: GraphComponent ,
 item: IModelItem? ):Boolean
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Selects the [GraphComponent.currentItem] current item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-selectCurrentItem">Online Documentation</a>
 */
 open   fun selectCurrentItem()
/**
 * Selects the given item.
 * @param [graphComponent] The [graphComponent].
 * @param [item] The item to select.
 * @param [extendSelection] if set to `true` the current selection is extended otherwise it is cleared beforehand.
 * @see [clearSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-selectItem">Online Documentation</a>
 */
 open protected   fun selectItem( graphComponent: GraphComponent ,
 item: IModelItem ,
 extendSelection: Boolean )
/**
 * Sets the "current" item to the given one.
 * @param [item] The item to set as the current item.
 * @see [onSetCurrentItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-setCurrentItem">Online Documentation</a>
 */
 open   fun setCurrentItem( item: IModelItem? )
/**
 * Sets the [graphComponent] to use for the various actions.
 * @param [graphComponent] The control to use or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-setGraphComponent">Online Documentation</a>
 */
 open protected   fun setGraphComponent( graphComponent: GraphComponent? )
/**
 * Predicate method that decides whether it is allowed to [collapse][collapseGroup] the given group node.
 * @return Whether to collapse the given group or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldCollapseGroup">Online Documentation</a>
 */
 open protected   fun shouldCollapseGroup( groupNode: INode ):Boolean
/**
 * Predicate method that decides whether it is allowed to [enter][enterGroup] the specific group node.
 * @param [node] The group node to enter.
 * @return Whether to enter the group or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldEnterGroup">Online Documentation</a>
 */
 open protected   fun shouldEnterGroup( node: INode ):Boolean
/**
 * Predicate method that decides whether it is allowed to [exit][exitGroup] the current group node.
 * @return Whether to exit the current group or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldExitGroup">Online Documentation</a>
 */
 open protected   fun shouldExitGroup():Boolean
/**
 * Predicate method that decides whether it is allowed to [expand][expandGroup] the given group node.
 * @return Whether to expand the given group or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldExpandGroup">Online Documentation</a>
 */
 open protected   fun shouldExpandGroup( node: INode ):Boolean
/**
 * Determines whether a given model item should be navigated to.
 * @param [item] The model item.
 * @return Whether the item should be considered for navigational commands.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldNavigateTo">Online Documentation</a>
 */
 open protected   fun shouldNavigateTo( item: IModelItem ):Boolean
/**
 * Determines whether the input mode should try to request the mutex when a command is executed.
 * @return whether the input mode should request the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldRequestMutex">Online Documentation</a>
 */
 open protected   fun shouldRequestMutex():Boolean
/**
 * Determines whether a given model item should be selected.
 * @param [item] The model item.
 * @return Whether the item should be selected by the navigational commands.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldSelect">Online Documentation</a>
 */
 open protected   fun shouldSelect( item: IModelItem ):Boolean
/**
 * Predicate method that decides whether it is allowed to [toggle][toggleExpansionState] the collapsed state of the given group node.
 * @return Whether to expand the given group or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldToggleExpansionState">Online Documentation</a>
 */
 open protected   fun shouldToggleExpansionState( node: INode ):Boolean
/**
 * Toggles the [expanded/collapsed][yfiles.graph.IFoldingView.isExpanded] state for the given group node in the [IFoldingView][yfiles.graph.IFoldingView].
 * @param [groupNode] The group node to toggle the state for.
 * @see [FoldingManager][yfiles.graph.FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-toggleExpansionState">Online Documentation</a>
 */
 open   fun toggleExpansionState( groupNode: INode )
/**
 * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController.hasMutex].
 * @return `true` iff this instance does not [own the mutex][ConcurrencyController.hasMutex].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs before a group will be [Collapsed][collapseGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupCollapsing">Online Documentation</a>
 */
fun addGroupCollapsingListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupCollapsingListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs whenever a group has been [Collapsed][collapseGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupCollapsed">Online Documentation</a>
 */
fun addGroupCollapsedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupCollapsedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs before a group will be [Expanded][expandGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExpanding">Online Documentation</a>
 */
fun addGroupExpandingListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupExpandingListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs whenever a group has been [Expanded][expandGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExpanded">Online Documentation</a>
 */
fun addGroupExpandedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupExpandedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs before a group will be [Entered][enterGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupEntering">Online Documentation</a>
 */
fun addGroupEnteringListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupEnteringListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs whenever a group has been [Entered][enterGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupEntered">Online Documentation</a>
 */
fun addGroupEnteredListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupEnteredListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs before a group will be [Exited][exitGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExiting">Online Documentation</a>
 */
fun addGroupExitingListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupExitingListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs whenever a group has been [Exited][exitGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExited">Online Documentation</a>
 */
fun addGroupExitedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupExitedListener(listener: EventHandler1<ItemEventArgs<INode>>)

companion object : ClassMetadata<NavigationInputMode> {
}
}

inline fun NavigationInputMode(
    block: NavigationInputMode.() -> Unit
): NavigationInputMode {
    return NavigationInputMode()
        .apply(block)
}

/**
 * Occurs before a group will be [Collapsed][collapseGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupCollapsing">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupCollapsingHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupCollapsingListener(listener)
    return { removeGroupCollapsingListener(listener) }
}
/**
 * Occurs whenever a group has been [Collapsed][collapseGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupCollapsed">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupCollapsedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupCollapsedListener(listener)
    return { removeGroupCollapsedListener(listener) }
}
/**
 * Occurs before a group will be [Expanded][expandGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExpanding">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExpandingHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupExpandingListener(listener)
    return { removeGroupExpandingListener(listener) }
}
/**
 * Occurs whenever a group has been [Expanded][expandGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExpanded">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExpandedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupExpandedListener(listener)
    return { removeGroupExpandedListener(listener) }
}
/**
 * Occurs before a group will be [Entered][enterGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupEntering">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupEnteringHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupEnteringListener(listener)
    return { removeGroupEnteringListener(listener) }
}
/**
 * Occurs whenever a group has been [Entered][enterGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupEntered">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupEnteredHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupEnteredListener(listener)
    return { removeGroupEnteredListener(listener) }
}
/**
 * Occurs before a group will be [Exited][exitGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExiting">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExitingHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupExitingListener(listener)
    return { removeGroupExitingListener(listener) }
}
/**
 * Occurs whenever a group has been [Exited][exitGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23GroupExited">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExitedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupExitedListener(listener)
    return { removeGroupExitedListener(listener) }
}
