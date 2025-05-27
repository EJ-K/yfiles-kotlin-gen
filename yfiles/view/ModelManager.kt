// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Manages the visual representations of items in a [CanvasComponent].
 * @param [T] The type of items this instance deals with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-constructor-ModelManager">Online Documentation</a>
 */
external abstract class ModelManager<T : IModelItem> 
protected constructor () : YObject {

/**
 * Gets the canvas instance this instance is managing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23canvasComponent">Online Documentation</a>
 */
final var canvasComponent: CanvasComponent?
/**
 * Gets or sets whether this [ModelManager] is enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23enabled">Online Documentation</a>
 */
final var enabled: Boolean
/**
 * Installs an item and adds it to this managers set of managed items.
 * @param [item] The item to add.
 * @return The newly created canvas object or `null` if nothing was installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-addItem">Online Documentation</a>
 */
 open protected   fun addItem( item: T ):ICanvasObject?
/**
 * Called by [installItem] to retrieve the canvas object group for a given item.
 * @param [item] The item to find a canvas object group for.
 * @return An [ICanvasObjectGroup] or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-getCanvasObjectGroup">Online Documentation</a>
 */
 abstract protected   fun getCanvasObjectGroup( item: T ):ICanvasObjectGroup?
/**
 * Called by [installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-getInstaller">Online Documentation</a>
 */
 abstract protected   fun getInstaller( item: T ):ICanvasObjectInstaller<T>?
/**
 * Installs this instance in the given [CanvasComponent] instance.
 * @param [canvas] The [CanvasComponent] instance to install this manager instance in.
 * @throws ArgumentError if `canvas` is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-install">Online Documentation</a>
 */
 open   fun install( canvas: CanvasComponent )
/**
 * Installs a member of the collection into the canvas using the [ICanvasObjectDescriptor] which is returned by [getInstaller].
 * @param [item] The member to install.
 * @return The canvas object that has been returned by the installer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-installItem">Online Documentation</a>
 */
 open protected   fun installItem( item: T ):ICanvasObject?
/**
 * Called when this manager gets [disabled][enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-onDisabled">Online Documentation</a>
 */
 abstract protected   fun onDisabled()
/**
 * Called when this manager gets [enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-onEnabled">Online Documentation</a>
 */
 abstract protected   fun onEnabled()
/**
 * Uninstalls the provided item and removes it from this managers set of managed items.
 * @param [item] The item to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-removeItem">Online Documentation</a>
 */
 open protected   fun removeItem( item: T )
/**
 * Uninstalls this instance from the given [CanvasComponent] instance.
 * @param [canvas] The [CanvasComponent] to remove this manager instance from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-uninstall">Online Documentation</a>
 */
 open   fun uninstall( canvas: CanvasComponent )
/**
 * Removes the given [ICanvasObject].
 * @param [canvasObject] The canvas objects that have been associated with the descriptor.
 * @see [ICanvasObject.remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-uninstallItem">Online Documentation</a>
 */
 open protected   fun uninstallItem( canvasObject: ICanvasObject )

companion object : ClassMetadata<ModelManager<*>> {
}
}
