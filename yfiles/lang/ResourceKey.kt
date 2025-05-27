// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

        @JsName("String")
        external class ResourceKey<T:Any>
        private constructor()
        
        inline fun <T:Any> ResourceKey(source:String):ResourceKey<T> = 
            source.unsafeCast<ResourceKey<T>>()
        
        object ResourceKeys {
            /**
 * Default value - "Add Bend"
 */
inline val ADD_BEND__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddBend.RedoName")

/**
 * Default value - "Remove Bend"
 */
inline val ADD_BEND__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddBend.UndoName")

/**
 * Default value - "Add Label"
 */
inline val ADD_LABEL__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddLabel.RedoName")

/**
 * Default value - "Remove Label"
 */
inline val ADD_LABEL__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddLabel.UndoName")

/**
 * Default value - "Add Label"
 */
inline val ADD_LABEL: ResourceKey<String>
    get() = ResourceKey("AddLabel")

/**
 * Default hotkey - `Shift+F2`
 */
inline val ADD_LABEL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("AddLabelKey")

/**
 * Default value - "Add Port"
 */
inline val ADD_PORT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddPort.RedoName")

/**
 * Default value - "Remove Port"
 */
inline val ADD_PORT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddPort.UndoName")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize.RedoName")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize.UndoName")

/**
 * Default hotkey - `Control+Shift+G`
 */
inline val ADJUST_GROUP_NODE_SIZE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("AdjustGroupNodeSizeKey")

/**
 * Default value - "Adjust Node Size"
 */
inline val ADJUST_TO_SIZE_CONSTRAINTS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustToSizeConstraints.RedoName")

/**
 * Default value - "Adjust Node Size"
 */
inline val ADJUST_TO_SIZE_CONSTRAINTS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustToSizeConstraints.UndoName")

/**
 * Default value - "Create Edge"
 */
inline val BEGIN_EDGE_CREATION: ResourceKey<String>
    get() = ResourceKey("BeginEdgeCreation")

/**
 * Default value - "Collapse Group"
 */
inline val COLLAPSE_GROUP: ResourceKey<String>
    get() = ResourceKey("CollapseGroup")

/**
 * Default hotkey - `Alt+ArrowLeft`
 */
inline val COLLAPSE_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CollapseGroupKey")

/**
 * Default value - "Collapse Node"
 */
inline val COLLAPSE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CollapseNode.RedoName")

/**
 * Default value - "Expand Node"
 */
inline val COLLAPSE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CollapseNode.UndoName")

/**
 * Default value - "Copy"
 */
inline val COPY: ResourceKey<String>
    get() = ResourceKey("Copy")

/**
 * Default hotkey - `Action+C;Control+Insert`
 */
inline val COPY_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CopyKey")

/**
 * Default value - "Add Edge"
 */
inline val CREATE_EDGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateEdge.RedoName")

/**
 * Default value - "Remove Edge"
 */
inline val CREATE_EDGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateEdge.UndoName")

/**
 * Default value - "Add Node"
 */
inline val CREATE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateNode.RedoName")

/**
 * Default value - "Remove Node"
 */
inline val CREATE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateNode.UndoName")

/**
 * Default value - "Add Stripe"
 */
inline val CREATE_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateStripe.RedoName")

/**
 * Default value - "Remove Stripe"
 */
inline val CREATE_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateStripe.UndoName")

/**
 * Default value - "Cut"
 */
inline val CUT: ResourceKey<String>
    get() = ResourceKey("Cut")

/**
 * Default value - "Redo Cut"
 */
inline val CUT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Cut.RedoName")

/**
 * Default value - "Undo Cut"
 */
inline val CUT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Cut.UndoName")

/**
 * Default hotkey - `Action+X;Shift+Delete`
 */
inline val CUT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CutKey")

/**
 * Default value - "Zoom Out"
 */
inline val DECREASE_ZOOM: ResourceKey<String>
    get() = ResourceKey("DecreaseZoom")

/**
 * Default hotkey - `Action+Subtract`
 */
inline val DECREASE_ZOOM_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DecreaseZoomKey")

/**
 * Default value - "Delete"
 */
inline val DELETE: ResourceKey<String>
    get() = ResourceKey("Delete")

/**
 * Default hotkey - `Delete;Backspace`
 */
inline val DELETE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DeleteKey")

/**
 * Default value - "Redo Delete"
 */
inline val DELETE_SELECTION__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("DeleteSelection.RedoName")

/**
 * Default value - "Undo Delete"
 */
inline val DELETE_SELECTION__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("DeleteSelection.UndoName")

/**
 * Default value - "Deselect All"
 */
inline val DESELECT_ALL: ResourceKey<String>
    get() = ResourceKey("DeselectAll")

/**
 * Default hotkey - `Action+Shift+A`
 */
inline val DESELECT_ALL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DeselectAllKey")

/**
 * Default value - "Deselect Item"
 */
inline val DESELECT_ITEM: ResourceKey<String>
    get() = ResourceKey("DeselectItem")

/**
 * Default value - "Duplicate"
 */
inline val DUPLICATE: ResourceKey<String>
    get() = ResourceKey("Duplicate")

/**
 * Default value - "Redo Duplicate"
 */
inline val DUPLICATE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Duplicate.RedoName")

/**
 * Default value - "Undo Duplicate"
 */
inline val DUPLICATE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Duplicate.UndoName")

/**
 * Default hotkey - `Action+D`
 */
inline val DUPLICATE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DuplicateKey")

/**
 * Default value - "Edit Label"
 */
inline val EDIT_LABEL: ResourceKey<String>
    get() = ResourceKey("EditLabel")

/**
 * Default hotkey - `F2;Enter`
 */
inline val EDIT_LABEL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("EditLabelKey")

/**
 * Default value - "Enter Group"
 */
inline val ENTER_GROUP: ResourceKey<String>
    get() = ResourceKey("EnterGroup")

/**
 * Default hotkey - `Alt+ArrowDown`
 */
inline val ENTER_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("EnterGroupKey")

/**
 * Default value - "Exit Group"
 */
inline val EXIT_GROUP: ResourceKey<String>
    get() = ResourceKey("ExitGroup")

/**
 * Default hotkey - `Alt+ArrowUp`
 */
inline val EXIT_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExitGroupKey")

/**
 * Default value - "Expand Group"
 */
inline val EXPAND_GROUP: ResourceKey<String>
    get() = ResourceKey("ExpandGroup")

/**
 * Default value - "Expand Group"
 */
inline val EXPAND_GROUP__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ExpandGroup.RedoName")

/**
 * Default value - "Collapse Group"
 */
inline val EXPAND_GROUP__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ExpandGroup.UndoName")

/**
 * Default hotkey - `Alt+ArrowRight`
 */
inline val EXPAND_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExpandGroupKey")

/**
 * Default value - "Extend Selection Down"
 */
inline val EXTEND_SELECTION_DOWN: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionDown")

/**
 * Default hotkey - `Shift+ArrowDown`
 */
inline val EXTEND_SELECTION_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionDownKey")

/**
 * Default value - "Extend Selection to Child"
 */
inline val EXTEND_SELECTION_HIERARCHY_DOWN: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionHierarchyDown")

/**
 * Default hotkey - `Shift+Ctrl+PageDown`
 */
inline val EXTEND_SELECTION_HIERARCHY_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionHierarchyDownKey")

/**
 * Default value - "Extend Selection to Parent"
 */
inline val EXTEND_SELECTION_HIERARCHY_UP: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionHierarchyUp")

/**
 * Default hotkey - `Shift+Ctrl+PageUp`
 */
inline val EXTEND_SELECTION_HIERARCHY_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionHierarchyUpKey")

/**
 * Default value - "Extend Selection Left"
 */
inline val EXTEND_SELECTION_LEFT: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionLeft")

/**
 * Default hotkey - `Shift+ArrowLeft`
 */
inline val EXTEND_SELECTION_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionLeftKey")

/**
 * Default value - "Extend Selection Right"
 */
inline val EXTEND_SELECTION_RIGHT: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionRight")

/**
 * Default hotkey - `Shift+ArrowRight`
 */
inline val EXTEND_SELECTION_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionRightKey")

/**
 * Default value - "Extend Selection Up"
 */
inline val EXTEND_SELECTION_UP: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionUp")

/**
 * Default hotkey - `Shift+ArrowUp`
 */
inline val EXTEND_SELECTION_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionUpKey")

/**
 * Default value - "Fit Content"
 */
inline val FIT_CONTENT: ResourceKey<String>
    get() = ResourceKey("FitContent")

/**
 * Default value - "Fit Graph Bounds"
 */
inline val FIT_GRAPH_BOUNDS: ResourceKey<String>
    get() = ResourceKey("FitGraphBounds")

/**
 * Default hotkey - `Alt+1`
 */
inline val FIT_GRAPH_BOUNDS_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("FitGraphBoundsKey")

/**
 * Default value - "Group Selection"
 */
inline val GROUP_SELECTION: ResourceKey<String>
    get() = ResourceKey("GroupSelection")

/**
 * Default hotkey - `Action+G`
 */
inline val GROUP_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("GroupSelectionKey")

/**
 * Default value - "Zoom In"
 */
inline val INCREASE_ZOOM: ResourceKey<String>
    get() = ResourceKey("IncreaseZoom")

/**
 * Default hotkey - `Action+Add`
 */
inline val INCREASE_ZOOM_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("IncreaseZoomKey")

/**
 * Default value - "Lower"
 */
inline val LOWER: ResourceKey<String>
    get() = ResourceKey("Lower")

/**
 * Default value - "Lower"
 */
inline val LOWER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Lower.RedoName")

/**
 * Default value - "Lower"
 */
inline val LOWER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Lower.UndoName")

/**
 * Default value - "Move Items"
 */
inline val MOVE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Move.RedoName")

/**
 * Default value - "Move Items"
 */
inline val MOVE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Move.UndoName")

/**
 * Default value - "Move Down"
 */
inline val MOVE_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveDown")

/**
 * Default hotkey - `ArrowDown`
 */
inline val MOVE_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveDownKey")

/**
 * Default value - "Move Focus Down"
 */
inline val MOVE_FOCUS_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveFocusDown")

/**
 * Default hotkey - `Action+ArrowDown`
 */
inline val MOVE_FOCUS_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusDownKey")

/**
 * Default value - "Move Focus to Child"
 */
inline val MOVE_FOCUS_HIERARCHY_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveFocusHierarchyDown")

/**
 * Default hotkey - `Ctrl+PageDown`
 */
inline val MOVE_FOCUS_HIERARCHY_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusHierarchyDownKey")

/**
 * Default value - "Move Focus to Parent"
 */
inline val MOVE_FOCUS_HIERARCHY_UP: ResourceKey<String>
    get() = ResourceKey("MoveFocusHierarchyUp")

/**
 * Default hotkey - `Ctrl+PageUp`
 */
inline val MOVE_FOCUS_HIERARCHY_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusHierarchyUpKey")

/**
 * Default value - "Move Focus Left"
 */
inline val MOVE_FOCUS_LEFT: ResourceKey<String>
    get() = ResourceKey("MoveFocusLeft")

/**
 * Default hotkey - `Action+ArrowLeft`
 */
inline val MOVE_FOCUS_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusLeftKey")

/**
 * Default value - "Move Focus Right"
 */
inline val MOVE_FOCUS_RIGHT: ResourceKey<String>
    get() = ResourceKey("MoveFocusRight")

/**
 * Default hotkey - `Action+ArrowRight`
 */
inline val MOVE_FOCUS_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusRightKey")

/**
 * Default value - "Move Focus Up"
 */
inline val MOVE_FOCUS_UP: ResourceKey<String>
    get() = ResourceKey("MoveFocusUp")

/**
 * Default hotkey - `Action+ArrowUp`
 */
inline val MOVE_FOCUS_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusUpKey")

/**
 * Default value - "Move Handle"
 */
inline val MOVE_HANDLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("MoveHandle.RedoName")

/**
 * Default value - "Move Handle"
 */
inline val MOVE_HANDLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("MoveHandle.UndoName")

/**
 * Default value - "Move to child"
 */
inline val MOVE_HIERARCHY_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveHierarchyDown")

/**
 * Default hotkey - `Alt+PageDown`
 */
inline val MOVE_HIERARCHY_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveHierarchyDownKey")

/**
 * Default value - "Move to Parent"
 */
inline val MOVE_HIERARCHY_UP: ResourceKey<String>
    get() = ResourceKey("MoveHierarchyUp")

/**
 * Default hotkey - `Alt+PageUp`
 */
inline val MOVE_HIERARCHY_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveHierarchyUpKey")

/**
 * Default value - "Move Left"
 */
inline val MOVE_LEFT: ResourceKey<String>
    get() = ResourceKey("MoveLeft")

/**
 * Default hotkey - `ArrowLeft`
 */
inline val MOVE_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveLeftKey")

/**
 * Default value - "Move Right"
 */
inline val MOVE_RIGHT: ResourceKey<String>
    get() = ResourceKey("MoveRight")

/**
 * Default hotkey - `ArrowRight`
 */
inline val MOVE_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveRightKey")

/**
 * Default value - "Move Up"
 */
inline val MOVE_UP: ResourceKey<String>
    get() = ResourceKey("MoveUp")

/**
 * Default hotkey - `ArrowUp`
 */
inline val MOVE_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveUpKey")

/**
 * Default value - "New"
 */
inline val NEW: ResourceKey<String>
    get() = ResourceKey("New")

/**
 * Default hotkey - `Action+N`
 */
inline val NEW_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("NewKey")

/**
 * Default value - "Add Node"
 */
inline val NODE_DROP_INPUT_MODE__NODE_DROPPED__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("NodeDropInputMode.NodeDropped.RedoName")

/**
 * Default value - "Remove Node"
 */
inline val NODE_DROP_INPUT_MODE__NODE_DROPPED__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("NodeDropInputMode.NodeDropped.UndoName")

/**
 * Default value - "Paste"
 */
inline val PASTE: ResourceKey<String>
    get() = ResourceKey("Paste")

/**
 * Default value - "Redo Paste"
 */
inline val PASTE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Paste.RedoName")

/**
 * Default value - "Undo Paste"
 */
inline val PASTE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Paste.UndoName")

/**
 * Default hotkey - `Action+V;Shift+Insert`
 */
inline val PASTE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("PasteKey")

/**
 * Default value - "Raise"
 */
inline val RAISE: ResourceKey<String>
    get() = ResourceKey("Raise")

/**
 * Default value - "Raise"
 */
inline val RAISE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Raise.RedoName")

/**
 * Default value - "Raise"
 */
inline val RAISE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Raise.UndoName")

/**
 * Default value - "Redo"
 */
inline val REDO: ResourceKey<String>
    get() = ResourceKey("Redo")

/**
 * Default hotkey - `Action+Y;Action+Shift+Z`
 */
inline val REDO_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("RedoKey")

/**
 * Default value - "Remove Bend"
 */
inline val REMOVE_BEND__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveBend.RedoName")

/**
 * Default value - "Add Bend"
 */
inline val REMOVE_BEND__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveBend.UndoName")

/**
 * Default value - "Remove Edge"
 */
inline val REMOVE_EDGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveEdge.RedoName")

/**
 * Default value - "Add Edge"
 */
inline val REMOVE_EDGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveEdge.UndoName")

/**
 * Default value - "Remove Label"
 */
inline val REMOVE_LABEL__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveLabel.RedoName")

/**
 * Default value - "Add Label"
 */
inline val REMOVE_LABEL__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveLabel.UndoName")

/**
 * Default value - "Remove Node"
 */
inline val REMOVE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveNode.RedoName")

/**
 * Default value - "Add Node"
 */
inline val REMOVE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveNode.UndoName")

/**
 * Default value - "Remove Port"
 */
inline val REMOVE_PORT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemovePort.RedoName")

/**
 * Default value - "Add Port"
 */
inline val REMOVE_PORT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemovePort.UndoName")

/**
 * Default value - "Remove Stripe"
 */
inline val REMOVE_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveStripe.RedoName")

/**
 * Default value - "Add Stripe"
 */
inline val REMOVE_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveStripe.UndoName")

/**
 * Default value - "Reparent Stripe"
 */
inline val REPARENT_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReparentStripe.RedoName")

/**
 * Default value - "Reparent Stripe"
 */
inline val REPARENT_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReparentStripe.UndoName")

/**
 * Default value - "Resize Node"
 */
inline val RESIZE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ResizeNode.RedoName")

/**
 * Default value - "Resize Node"
 */
inline val RESIZE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ResizeNode.UndoName")

/**
 * Default value - "Reverse Edge"
 */
inline val REVERSE_EDGE: ResourceKey<String>
    get() = ResourceKey("ReverseEdge")

/**
 * Default value - "Reverse Edge"
 */
inline val REVERSE_EDGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReverseEdge.RedoName")

/**
 * Default value - "Reverse Edge"
 */
inline val REVERSE_EDGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReverseEdge.UndoName")

/**
 * Default hotkey - `Action+R`
 */
inline val REVERSE_EDGE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ReverseEdgeKey")

/**
 * Default value - "Scroll Page Down"
 */
inline val SCROLL_PAGE_DOWN: ResourceKey<String>
    get() = ResourceKey("ScrollPageDown")

/**
 * Default hotkey - `PageDown`
 */
inline val SCROLL_PAGE_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageDownKey")

/**
 * Default value - "Scroll Page Left"
 */
inline val SCROLL_PAGE_LEFT: ResourceKey<String>
    get() = ResourceKey("ScrollPageLeft")

/**
 * Default hotkey - `Shift+PageUp`
 */
inline val SCROLL_PAGE_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageLeftKey")

/**
 * Default value - "Scroll Page Right"
 */
inline val SCROLL_PAGE_RIGHT: ResourceKey<String>
    get() = ResourceKey("ScrollPageRight")

/**
 * Default hotkey - `Shift+PageDown`
 */
inline val SCROLL_PAGE_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageRightKey")

/**
 * Default value - "Scroll Page Up"
 */
inline val SCROLL_PAGE_UP: ResourceKey<String>
    get() = ResourceKey("ScrollPageUp")

/**
 * Default hotkey - `PageUp`
 */
inline val SCROLL_PAGE_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageUpKey")

/**
 * Default value - "Select All"
 */
inline val SELECT_ALL: ResourceKey<String>
    get() = ResourceKey("SelectAll")

/**
 * Default hotkey - `Action+A`
 */
inline val SELECT_ALL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("SelectAllKey")

/**
 * Default value - "Select Item"
 */
inline val SELECT_ITEM: ResourceKey<String>
    get() = ResourceKey("SelectItem")

/**
 * Default value - "Set Current Item"
 */
inline val SET_CURRENT_ITEM: ResourceKey<String>
    get() = ResourceKey("SetCurrentItem")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_EDGE_PORTS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgePorts.RedoName")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_EDGE_PORTS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgePorts.UndoName")

/**
 * Default value - "Change Edge Style"
 */
inline val SET_EDGE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgeStyle.RedoName")

/**
 * Default value - "Change Edge Style"
 */
inline val SET_EDGE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgeStyle.UndoName")

/**
 * Default value - "Convert Back to Normal Node"
 */
inline val SET_IS_GROUP_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetIsGroupNode.RedoName")

/**
 * Default value - "Convert to Group Node"
 */
inline val SET_IS_GROUP_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetIsGroupNode.UndoName")

/**
 * Default value - "Convert Back to Group Node"
 */
inline val SET_IS_NO_GROUP_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetIsNoGroupNode.RedoName")

/**
 * Default value - "Convert to Normal Node"
 */
inline val SET_IS_NO_GROUP_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetIsNoGroupNode.UndoName")

/**
 * Default value - "Change Label Position"
 */
inline val SET_LABEL_MODEL_PARAMETER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelModelParameter.RedoName")

/**
 * Default value - "Change Label Position"
 */
inline val SET_LABEL_MODEL_PARAMETER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelModelParameter.UndoName")

/**
 * Default value - "Change Label Style"
 */
inline val SET_LABEL_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelStyle.RedoName")

/**
 * Default value - "Change Label Style"
 */
inline val SET_LABEL_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelStyle.UndoName")

/**
 * Default value - "Change Label Text"
 */
inline val SET_LABEL_TEXT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelText.RedoName")

/**
 * Default value - "Change Label Text"
 */
inline val SET_LABEL_TEXT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelText.UndoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_LOCATION_MODEL_PARAMETER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLocationModelParameter.RedoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_LOCATION_MODEL_PARAMETER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLocationModelParameter.UndoName")

/**
 * Default value - "Change Node Style"
 */
inline val SET_NODE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNodeStyle.RedoName")

/**
 * Default value - "Change Node Style"
 */
inline val SET_NODE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNodeStyle.UndoName")

/**
 * Default value - "Change Parent"
 */
inline val SET_PARENT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetParent.RedoName")

/**
 * Default value - "Change Parent"
 */
inline val SET_PARENT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetParent.UndoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_PORT_LOCATION_PARAMETER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortLocationParameter.RedoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_PORT_LOCATION_PARAMETER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortLocationParameter.UndoName")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_PORTS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPorts.RedoName")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_PORTS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPorts.UndoName")

/**
 * Default value - "Change Port Style"
 */
inline val SET_PORT_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortStyle.RedoName")

/**
 * Default value - "Change Port Style"
 */
inline val SET_PORT_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortStyle.UndoName")

/**
 * Default value - "Change Preferred Label Size"
 */
inline val SET_PREFERRED_LABEL_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPreferredLabelSize.RedoName")

/**
 * Default value - "Change Preferred Label Size"
 */
inline val SET_PREFERRED_LABEL_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPreferredLabelSize.UndoName")

/**
 * Default value - "Change Minimum Stripe Size"
 */
inline val SET_STRIPE_MINIMUM_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeMinimumSize.RedoName")

/**
 * Default value - "Change Minimum Stripe Size"
 */
inline val SET_STRIPE_MINIMUM_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeMinimumSize.UndoName")

/**
 * Default value - "Change Stripe Insets"
 */
inline val SET_STRIPE_PADDING__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripePadding.RedoName")

/**
 * Default value - "Change Stripe Insets"
 */
inline val SET_STRIPE_PADDING__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripePadding.UndoName")

/**
 * Default value - "Change Stripe Size"
 */
inline val SET_STRIPE_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeSize.RedoName")

/**
 * Default value - "Change Stripe Size"
 */
inline val SET_STRIPE_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeSize.UndoName")

/**
 * Default value - "Change Stripe Style"
 */
inline val SET_STRIPE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeStyle.RedoName")

/**
 * Default value - "Change Stripe Style"
 */
inline val SET_STRIPE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeStyle.UndoName")

/**
 * Default value - "Change Tag"
 */
inline val TAG_CHANGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("TagChange.RedoName")

/**
 * Default value - "Change Tag"
 */
inline val TAG_CHANGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("TagChange.UndoName")

/**
 * Default value - "To Back"
 */
inline val TO_BACK: ResourceKey<String>
    get() = ResourceKey("ToBack")

/**
 * Default value - "To Back"
 */
inline val TO_BACK__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ToBack.RedoName")

/**
 * Default value - "To Back"
 */
inline val TO_BACK__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ToBack.UndoName")

/**
 * Default value - "To Front"
 */
inline val TO_FRONT: ResourceKey<String>
    get() = ResourceKey("ToFront")

/**
 * Default value - "To Front"
 */
inline val TO_FRONT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ToFront.RedoName")

/**
 * Default value - "To Front"
 */
inline val TO_FRONT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ToFront.UndoName")

/**
 * Default value - "Toggle Expansion State"
 */
inline val TOGGLE_EXPANSION_STATE: ResourceKey<String>
    get() = ResourceKey("ToggleExpansionState")

/**
 * Default hotkey - `Alt+Shift+ArrowLeft;Alt+Shift+ArrowRight`
 */
inline val TOGGLE_EXPANSION_STATE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ToggleExpansionStateKey")

/**
 * Default value - "Toggle Selection"
 */
inline val TOGGLE_ITEM_SELECTION: ResourceKey<String>
    get() = ResourceKey("ToggleItemSelection")

/**
 * Default hotkey - `Control+Space`
 */
inline val TOGGLE_ITEM_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ToggleItemSelectionKey")

/**
 * Default value - "Unavailable"
 */
inline val UNAVAILABLE: ResourceKey<String>
    get() = ResourceKey("Unavailable")

/**
 * Default value - "Undo"
 */
inline val UNDO: ResourceKey<String>
    get() = ResourceKey("Undo")

/**
 * Default hotkey - `Action+Z`
 */
inline val UNDO_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("UndoKey")

/**
 * Default value - "Ungroup Selection"
 */
inline val UNGROUP_SELECTION: ResourceKey<String>
    get() = ResourceKey("UngroupSelection")

/**
 * Default hotkey - `Action+U`
 */
inline val UNGROUP_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("UngroupSelectionKey")

/**
 * Default value - "Update Content Bounds"
 */
inline val UPDATE_CONTENT_BOUNDS: ResourceKey<String>
    get() = ResourceKey("UpdateContentBounds")

/**
 * Default value - "Zoom"
 */
inline val ZOOM_100: ResourceKey<String>
    get() = ResourceKey("Zoom 100%")

/**
 * Default hotkey - `Action+0;Alt+0`
 */
inline val ZOOM_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ZoomKey")

/**
 * Default value - "Zoom To Current Item"
 */
inline val ZOOM_TO_CURRENT_ITEM: ResourceKey<String>
    get() = ResourceKey("ZoomToCurrentItem")

/**
 * Default hotkey - `Alt+3`
 */
inline val ZOOM_TO_CURRENT_ITEM_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ZoomToCurrentItemKey")

/**
 * Default value - "Zoom To Selected Items"
 */
inline val ZOOM_TO_SELECTION: ResourceKey<String>
    get() = ResourceKey("ZoomToSelection")

/**
 * Default hotkey - `Alt+2`
 */
inline val ZOOM_TO_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ZoomToSelectionKey")

        }
