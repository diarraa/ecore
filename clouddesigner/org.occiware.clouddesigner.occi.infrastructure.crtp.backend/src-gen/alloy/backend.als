// Generated at Wed Nov 09 13:07:01 CET 2016 from platform:/resource/org.occiware.clouddesigner.occi.infrastructure.crtp.backend/model/backend.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'backend'
//
// ======================================================================

module backend

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open crtp
open infrastructure

// ======================================================================
//
// OCCI extension 'backend'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "backend"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    import = core/extension + crtp/extension + infrastructure/extension
    no kinds
    mixins = vmaddon + linux + macosx + vmwarefolders + vswitchinfos + windows + vmimage + credential
    types = GuestOsIdentifiers_DataType
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmaddon'
//
// ======================================================================

one sig vmaddon extends Mixin {} {
    term = "vmaddon"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "Addon attributes for virtual machine, specific to vmware"
    depends = vmimage
    applies = infrastructure/compute
    attributes = vmaddon_vcpu + vmaddon_gueststate + vmaddon_guestosid + vmaddon_markedastemplate
    no actions
    entities in Vmaddon
}

//
// OCCI attribute 'vcpu'
//
one sig vmaddon_vcpu extends Attribute {} {
    name = "vcpu"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'gueststate'
//
one sig vmaddon_gueststate extends Attribute {} {
    name = "gueststate"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'guestosid'
//
one sig vmaddon_guestosid extends Attribute {} {
    name = "guestosid"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'markedastemplate'
//
one sig vmaddon_markedastemplate extends Attribute {} {
    name = "markedastemplate"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Vmaddon
// ======================================================================

sig Vmaddon in infrastructure/Compute {
    vcpu : lone ,
    gueststate : lone ,
    guestosid : lone ,
    markedastemplate : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#linux'
//
// ======================================================================

one sig linux extends Mixin {} {
    term = "linux"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "Mixin os_tpl for linux systems"
    depends = infrastructure/os_tpl
    applies = infrastructure/compute
    attributes = linux_guestid + linux_datastoreisopath
    no actions
    entities in Linux
}

//
// OCCI attribute 'guestid'
//
one sig linux_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig linux_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Linux
// ======================================================================

sig Linux in infrastructure/Compute {
    guestid : one GuestOsIdentifiers,
    datastoreisopath : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#macosx'
//
// ======================================================================

one sig macosx extends Mixin {} {
    term = "macosx"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "Mixin os_tpl for mac os x systems"
    depends = infrastructure/os_tpl
    applies = infrastructure/compute
    attributes = macosx_guestid + macosx_datastoreisopath
    no actions
    entities in Macosx
}

//
// OCCI attribute 'guestid'
//
one sig macosx_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig macosx_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Macosx
// ======================================================================

sig Macosx in infrastructure/Compute {
    guestid : one GuestOsIdentifiers,
    datastoreisopath : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmwarefolders'
//
// ======================================================================

one sig vmwarefolders extends Mixin {} {
    term = "vmwarefolders"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "This mixin add global attributes"
    no depends
    applies = infrastructure/compute + infrastructure/network + infrastructure/networkinterface + infrastructure/storage + infrastructure/storagelink
    attributes = vmwarefolders_datacentername + vmwarefolders_datastorename + vmwarefolders_clustername + vmwarefolders_hostsystemname + vmwarefolders_inventorypath
    no actions
    entities in Vmwarefolders
}

//
// OCCI attribute 'datacentername'
//
one sig vmwarefolders_datacentername extends Attribute {} {
    name = "datacentername"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastorename'
//
one sig vmwarefolders_datastorename extends Attribute {} {
    name = "datastorename"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'clustername'
//
one sig vmwarefolders_clustername extends Attribute {} {
    name = "clustername"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'hostsystemname'
//
one sig vmwarefolders_hostsystemname extends Attribute {} {
    name = "hostsystemname"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'inventorypath'
//
one sig vmwarefolders_inventorypath extends Attribute {} {
    name = "inventorypath"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Vmwarefolders
// ======================================================================

sig Vmwarefolders in infrastructure/Compute + infrastructure/Network + infrastructure/Networkinterface + infrastructure/Storage + infrastructure/Storagelink {
    datacentername : lone ,
    datastorename : lone ,
    clustername : lone ,
    hostsystemname : lone ,
    inventorypath : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vswitchinfos'
//
// ======================================================================

one sig vswitchinfos extends Mixin {} {
    term = "vswitchinfos"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "Give informations about a vswitch"
    no depends
    applies = infrastructure/network
    attributes = vswitchinfos_nbport
    no actions
    entities in Vswitchinfos
}

//
// OCCI attribute 'nbport'
//
one sig vswitchinfos_nbport extends Attribute {} {
    name = "nbport"
    no type 
    mutable = False
    required = False
    no default
    description = "Nb port of the vswitch"
    multiple_values = False
}

// ======================================================================
// Signature for Vswitchinfos
// ======================================================================

sig Vswitchinfos in infrastructure/Network {
    nbport : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#windows'
//
// ======================================================================

one sig windows extends Mixin {} {
    term = "windows"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    title = "Mixin os_tpl for windows system"
    depends = infrastructure/os_tpl
    applies = infrastructure/compute
    attributes = windows_guestid + windows_datastoreisopath
    no actions
    entities in Windows
}

//
// OCCI attribute 'guestid'
//
one sig windows_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig windows_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    no type 
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Windows
// ======================================================================

sig Windows in infrastructure/Compute {
    guestid : one GuestOsIdentifiers,
    datastoreisopath : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmimage'
//
// ======================================================================

one sig vmimage extends Mixin {} {
    term = "vmimage"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    no title
    no depends
    applies = infrastructure/compute
    attributes = vmimage_imagename
    no actions
    entities in Vmimage
}

//
// OCCI attribute 'imagename'
//
one sig vmimage_imagename extends Attribute {} {
    name = "imagename"
    no type 
    mutable = True
    required = False
    no default
    description = "Name of the template if this compute has a template or will be created with a template."
    multiple_values = False
}

// ======================================================================
// Signature for Vmimage
// ======================================================================

sig Vmimage in infrastructure/Compute {
    imagename : lone ,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#credential'
//
// ======================================================================

one sig credential extends Mixin {} {
    term = "credential"
    scheme = "http://occiware.org/occi/infrastructure/crtp/backend#"
    no title
    no depends
    no applies
    attributes = credential_user + credential_password
    no actions
    entities in Credential
}

//
// OCCI attribute 'user'
//
one sig credential_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'password'
//
one sig credential_password extends Attribute {} {
    name = "password"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Credential
// ======================================================================

sig Credential in core/Entity {
    user : one String,
    password : one String,
}

//
// OCCI data type GuestOsIdentifiers
//
one sig GuestOsIdentifiers_DataType extends DataType {} {
    name = "GuestOsIdentifiers"
}

abstract sig GuestOsIdentifiers extends EnumBase {}
one sig GuestOsIdentifiers_dosGuest, GuestOsIdentifiers_win31Guest, GuestOsIdentifiers_win95Guest, GuestOsIdentifiers_win98Guest, GuestOsIdentifiers_winMeGuest, GuestOsIdentifiers_winNTGuest, GuestOsIdentifiers_win2000ProGuest, GuestOsIdentifiers_win2000ServGuest, GuestOsIdentifiers_win2000AdvServGuest, GuestOsIdentifiers_winXPHomeGuest, GuestOsIdentifiers_winXPProGuest, GuestOsIdentifiers_winXPPro64Guest, GuestOsIdentifiers_winNetWebGuest, GuestOsIdentifiers_winNetStandardGuest, GuestOsIdentifiers_winNetEnterpriseGuest, GuestOsIdentifiers_winNetDatacenterGuest, GuestOsIdentifiers_winNetBusinessGuest, GuestOsIdentifiers_winNetStandard64Guest, GuestOsIdentifiers_winNetEnterprise64Guest, GuestOsIdentifiers_winLonghornGuest, GuestOsIdentifiers_winLonghorn64Guest, GuestOsIdentifiers_winNetDatacenter64Guest, GuestOsIdentifiers_winVistaGuest, GuestOsIdentifiers_winVista64Guest, GuestOsIdentifiers_windows7Guest, GuestOsIdentifiers_windows7_64Guest, GuestOsIdentifiers_windows7Server64Guest, GuestOsIdentifiers_windows8Guest, GuestOsIdentifiers_windows8_64Guest, GuestOsIdentifiers_windows8Server64Guest, GuestOsIdentifiers_windows9Guest, GuestOsIdentifiers_windows9_64Guest, GuestOsIdentifiers_windows9Server64Guest, GuestOsIdentifiers_windowsHyperVGuest, GuestOsIdentifiers_freebsdGuest, GuestOsIdentifiers_freebsd64Guest, GuestOsIdentifiers_redhatGuest, GuestOsIdentifiers_rhel2Guest, GuestOsIdentifiers_rhel3Guest, GuestOsIdentifiers_rhel3_64Guest, GuestOsIdentifiers_rhel4Guest, GuestOsIdentifiers_rhel4_64Guest, GuestOsIdentifiers_rhel5Guest, GuestOsIdentifiers_rhel5_64Guest, GuestOsIdentifiers_rhel6Guest, GuestOsIdentifiers_rhel6_64Guest, GuestOsIdentifiers_rhel7Guest, GuestOsIdentifiers_rhel7_64Guest, GuestOsIdentifiers_centosGuest, GuestOsIdentifiers_centos64Guest, GuestOsIdentifiers_oracleLinuxGuest, GuestOsIdentifiers_oracleLinux64Guest, GuestOsIdentifiers_suseGuest, GuestOsIdentifiers_suse64Guest, GuestOsIdentifiers_slesGuest, GuestOsIdentifiers_sles64Guest, GuestOsIdentifiers_sles10Guest, GuestOsIdentifiers_sles10_64Guest, GuestOsIdentifiers_sles11Guest, GuestOsIdentifiers_sles11_64Guest, GuestOsIdentifiers_sles12Guest, GuestOsIdentifiers_sles12_64Guest, GuestOsIdentifiers_nld9Guest, GuestOsIdentifiers_oesGuest, GuestOsIdentifiers_sjdsGuest, GuestOsIdentifiers_mandrakeGuest, GuestOsIdentifiers_mandrivaGuest, GuestOsIdentifiers_mandriva64Guest, GuestOsIdentifiers_turboLinuxGuest, GuestOsIdentifiers_turboLinux64Guest, GuestOsIdentifiers_ubuntuGuest, GuestOsIdentifiers_ubuntu64Guest, GuestOsIdentifiers_debian4Guest, GuestOsIdentifiers_debian4_64Guest, GuestOsIdentifiers_debian5Guest, GuestOsIdentifiers_debian5_64Guest, GuestOsIdentifiers_debian6Guest, GuestOsIdentifiers_debian6_64Guest, GuestOsIdentifiers_debian7Guest, GuestOsIdentifiers_debian7_64Guest, GuestOsIdentifiers_debian8Guest, GuestOsIdentifiers_debian8_64Guest, GuestOsIdentifiers_asianux3Guest, GuestOsIdentifiers_asianux3_64Guest, GuestOsIdentifiers_asianux4Guest, GuestOsIdentifiers_asianux4_64Guest, GuestOsIdentifiers_asianux5_64Guest, GuestOsIdentifiers_opensuseGuest, GuestOsIdentifiers_opensuse64Guest, GuestOsIdentifiers_fedoraGuest, GuestOsIdentifiers_fedora64Guest, GuestOsIdentifiers_coreos64Guest, GuestOsIdentifiers_other24xLinuxGuest, GuestOsIdentifiers_other26xLinuxGuest, GuestOsIdentifiers_otherLinuxGuest, GuestOsIdentifiers_other3xLinuxGuest, GuestOsIdentifiers_genericLinuxGuest, GuestOsIdentifiers_other24xLinux64Guest, GuestOsIdentifiers_other26xLinux64Guest, GuestOsIdentifiers_other3xLinux64Guest, GuestOsIdentifiers_otherLinux64Guest, GuestOsIdentifiers_solaris6Guest, GuestOsIdentifiers_solaris7Guest, GuestOsIdentifiers_solaris8Guest, GuestOsIdentifiers_solaris9Guest, GuestOsIdentifiers_solaris10Guest, GuestOsIdentifiers_solaris10_64Guest, GuestOsIdentifiers_solaris11_64Guest, GuestOsIdentifiers_os2Guest, GuestOsIdentifiers_eComStationGuest, GuestOsIdentifiers_eComStation2Guest, GuestOsIdentifiers_netware4Guest, GuestOsIdentifiers_netware5Guest, GuestOsIdentifiers_netware6Guest, GuestOsIdentifiers_openServer5Guest, GuestOsIdentifiers_openServer6Guest, GuestOsIdentifiers_unixWare7Guest, GuestOsIdentifiers_darwinGuest, GuestOsIdentifiers_darwin64Guest, GuestOsIdentifiers_darwin10Guest, GuestOsIdentifiers_darwin10_64Guest, GuestOsIdentifiers_darwin11Guest, GuestOsIdentifiers_darwin11_64Guest, GuestOsIdentifiers_darwin12_64Guest, GuestOsIdentifiers_darwin13_64Guest, GuestOsIdentifiers_darwin14_64Guest, GuestOsIdentifiers_vmkernelGuest, GuestOsIdentifiers_vmkernel5Guest, GuestOsIdentifiers_vmkernel6Guest, GuestOsIdentifiers_otherGuest, GuestOsIdentifiers_otherGuest64 extends GuestOsIdentifiers {}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

