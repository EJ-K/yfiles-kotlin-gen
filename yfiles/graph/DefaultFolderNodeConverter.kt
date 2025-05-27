// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * An implementation of [IFolderNodeConverter] interface which manages the appearance of folder nodes according to a number of properties and overridable methods.
 * @see [FoldingManager]
 * @see [IFolderNodeConverter]
 * @see [DefaultFoldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of this class using the values provided by the `folderNodeDefaults` parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-constructor-DefaultFolderNodeConverter(INodeDefaults)">Online Documentation</a>
 */
external open class DefaultFolderNodeConverter  ( folderNodeDefaults: INodeDefaults  = definedExternally) : IFolderNodeConverter {

/**
 * Gets or sets a value indicating whether the [labelLayoutParameter] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23cloneLabelLayoutParameter">Online Documentation</a>
 */
final var cloneLabelLayoutParameter: Boolean
/**
 * Gets or sets a value indicating whether the [labelStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23cloneLabelStyle">Online Documentation</a>
 */
final var cloneLabelStyle: Boolean
/**
 * Gets or sets a value indicating whether the [folderNodeStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23cloneNodeStyle">Online Documentation</a>
 */
final var cloneNodeStyle: Boolean
/**
 * Gets or sets a value indicating whether the [portLocationParameter] instance should be assigned as a [clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23clonePortLocationParameter">Online Documentation</a>
 */
final var clonePortLocationParameter: Boolean
/**
 * Gets or sets a value indicating whether the [portStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23clonePortStyle">Online Documentation</a>
 */
final var clonePortStyle: Boolean
/**
 * Gets or sets a value indicating whether the first label of the [master group node][IFoldingView.getMasterItem] should be recreated for the collapsed group node instance.
 * @see [labelStyle]
 * @see [labelLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23copyFirstLabel">Online Documentation</a>
 */
final var copyFirstLabel: Boolean
/**
 * Sets the initial size of the [INode.layout] of the collapsed group node that will be assigned during the [creation][IFolderNodeConverter.initializeFolderNodeState] of the appearance of the collapsed group node.
 * @see [initializeFolderNodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23folderNodeSize">Online Documentation</a>
 */
final var folderNodeSize: Size?
/**
 * Gets or sets the [INodeStyle] to use for the [collapsed][IFoldingView.collapse] group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23folderNodeStyle">Online Documentation</a>
 */
final var folderNodeStyle: INodeStyle?
/**
 * Gets or sets the [ILabelModelParameter] to use for the first label of the collapsed group node.
 * @see [copyFirstLabel]
 * @see [initializeFolderNodeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23labelLayoutParameter">Online Documentation</a>
 */
final var labelLayoutParameter: ILabelModelParameter?
/**
 * Gets or sets the [ILabelStyle] to use for the first label of the collapsed group nodes.
 * @see [copyFirstLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23labelStyle">Online Documentation</a>
 */
final var labelStyle: ILabelStyle?
/**
 * Gets or sets the [ILabelModelParameter] to use for the first label of ports at the collapsed group node.
 * @see [copyFirstLabel]
 * @see [initializeFolderNodeLabels]
 * @see [initializeFolderNodePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23portLabelLayoutParameter">Online Documentation</a>
 */
final var portLabelLayoutParameter: ILabelModelParameter?
/**
 * Gets or sets the [ILabelStyle] to use for the first label of the ports of the collapsed group nodes.
 * @see [copyFirstLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23portLabelStyle">Online Documentation</a>
 */
final var portLabelStyle: ILabelStyle?
/**
 * Gets or sets the [IPortLocationModelParameter] to use for the ports at the collapsed group node that [represent][IFoldingView.getViewItem] the ports of the [master group node][IFoldingView.getMasterItem] in the collapsed state.
 * @see [createPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23portLocationParameter">Online Documentation</a>
 */
final var portLocationParameter: IPortLocationModelParameter?
/**
 * Gets or sets the [IPortStyle] to use for the ports at the collapsed group node that [represent][IFoldingView.getViewItem] the ports of the [master group node][IFoldingView.getMasterItem] in the collapsed state.
 * @see [createPortStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23portStyle">Online Documentation</a>
 */
final var portStyle: IPortStyle?
/**
 * Creates the [ILabelModelParameter] for use in [initializeFolderNodeLabels].
 * @param [foldingView] The folding view instance.
 * @param [localLabel] The local label in the view whose [ILabel.layoutParameter] should be initialized. May be `null` if the label layout parameter is requested for the label creation.
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The [labelLayoutParameter] (or [portLabelLayoutParameter] for port labels) or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneLabelLayoutParameter] property. This method may return `null` to indicate that the default label layout parameter should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createLabelLayoutParameter">Online Documentation</a>
 */
 open protected   fun createLabelLayoutParameter( foldingView: IFoldingView ,
 localLabel: ILabel? ,
 masterLabel: ILabel ):ILabelModelParameter?
/**
 * Creates the [ILabelStyle] for use in [initializeFolderNodeLabels].
 * @param [foldingView] The folding view instance.
 * @param [localLabel] The local label in the view whose [ILabel.style] should be initialized. May be `null` if the label style is requested for the label creation.
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The [labelStyle] (or [portLabelStyle] for port labels) or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneLabelStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createLabelStyle">Online Documentation</a>
 */
 open protected   fun createLabelStyle( foldingView: IFoldingView ,
 localLabel: ILabel? ,
 masterLabel: ILabel ):ILabelStyle?
/**
 * Creates the [INodeStyle] for use in [initializeFolderNodeStyle].
 * @param [foldingView] The folding view instance.
 * @param [viewNode] The local folder node in the view whose [INode.style] should be initialized.
 * @param [masterNode] The node that is being represented by the folder node.
 * @return The [folderNodeStyle] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneNodeStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createNodeStyle">Online Documentation</a>
 */
 open protected   fun createNodeStyle( foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode ):INodeStyle?
/**
 * Creates the [IPortLocationModelParameter] for use in [initializeFolderNodePorts].
 * @param [foldingView] The folding view instance.
 * @param [localPort] The local port in the view whose [IPort.locationParameter] should be initialized.
 * @param [masterPort] The port that is being represented by the folding port.
 * @return The [portLocationParameter] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [clonePortLocationParameter] property. This method may return `null` to indicate that the default port location parameter should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createPortLocationParameter">Online Documentation</a>
 */
 open protected   fun createPortLocationParameter( foldingView: IFoldingView ,
 localPort: IPort ,
 masterPort: IPort ):IPortLocationModelParameter?
/**
 * Creates the [IPortStyle] for use in [initializeFolderNodePorts].
 * @param [foldingView] The folding view instance.
 * @param [localPort] The local port in the view whose [IPort.style] should be initialized.
 * @param [masterPort] The port that is being represented by the folding port.
 * @return The [portStyle] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [clonePortStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createPortStyle">Online Documentation</a>
 */
 open protected   fun createPortStyle( foldingView: IFoldingView ,
 localPort: IPort ,
 masterPort: IPort ):IPortStyle?
/**
 * Gets the preferred size for use in [initializeFolderNodeLabels] and [synchronizeLabels].
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The preferred size of the given label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-createPreferredLabelSize">Online Documentation</a>
 */
 open protected   fun createPreferredLabelSize( masterLabel: ILabel ):Size
/**
 * Initializes the initial labels of the collapsed group node.
 * @param [state] The node view state whose labels should be synchronized.
 * @param [foldingView] The folding view instance that has triggered the [initializeFolderNodeState] call.
 * @param [viewNode] The collapsed group node in the view that may be changed using the [FolderNodeState].
 * @param [masterNode] The master node that the folder node represents.
 * @see [labelStyle]
 * @see [labelLayoutParameter]
 * @see [FoldingManager.getFolderNodeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-initializeFolderNodeLabels">Online Documentation</a>
 */
 open protected   fun initializeFolderNodeLabels( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Initializes the [INode.layout] of the collapsed group node.
 * @param [state] The node view state whose layout should be synchronized.
 * @param [foldingView] The folding view instance.
 * @param [viewNode] The local collapsed group node to change.
 * @param [masterNode] The master node that is represented by the local group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-initializeFolderNodeLayout">Online Documentation</a>
 */
 open protected   fun initializeFolderNodeLayout( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Called by [initializeFolderNodeState] to initialize the appearance of the [representatives][IFoldingView.getViewItem] of the master ports at the collapsed group node.
 * @param [state] The node view state whose ports should be synchronized.
 * @param [foldingView] The folding view instance.
 * @param [viewNode] The local group node.
 * @param [masterNode] The master group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-initializeFolderNodePorts">Online Documentation</a>
 */
 open protected   fun initializeFolderNodePorts( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Implements the [IFolderNodeConverter.initializeFolderNodeState] method and initializes the appearance of the collapsed group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-initializeFolderNodeState">Online Documentation</a>
 */
 override   fun initializeFolderNodeState( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Initializes the [style property][FolderNodeState.style] of the collapsed group node.
 * @param [state] The node view state whose style should be synchronized.
 * @param [foldingView] The folding view instance that has triggered the [initializeFolderNodeState] call.
 * @param [viewNode] The local node in the view that may be changed using the [FolderNodeState].
 * @param [masterNode] The master node that the local folder node represents.
 * @see [FoldingManager.getFolderNodeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-initializeFolderNodeStyle">Online Documentation</a>
 */
 open protected   fun initializeFolderNodeStyle( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Called by [updateFolderNodeState] to synchronize the first label if [copyFirstLabel] is enabled.
 * @param [state] The node view state whose labels should be synchronized.
 * @param [foldingView] The folding view.
 * @param [viewNode] The local node instance.
 * @param [masterNode] The master node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-synchronizeLabels">Online Documentation</a>
 */
 open protected   fun synchronizeLabels( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Implements the [IFolderNodeConverter.updateFolderNodeState] method and changes the folder node appearance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFolderNodeConverter%23DefaultFolderNodeConverter-method-updateFolderNodeState">Online Documentation</a>
 */
 override   fun updateFolderNodeState( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )

companion object : ClassMetadata<DefaultFolderNodeConverter> {
}
}

inline fun DefaultFolderNodeConverter(
    block: DefaultFolderNodeConverter.() -> Unit
): DefaultFolderNodeConverter {
    return DefaultFolderNodeConverter()
        .apply(block)
}
